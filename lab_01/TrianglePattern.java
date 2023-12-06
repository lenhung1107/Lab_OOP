package lab_01;
import java.util.Scanner;
public class TrianglePattern 
{
    public static void main(String[] args) 
    {
    	System.out.println("Le Thi Nhung 20210662 \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua tam giac: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Hay nhap chieu cao hop le!");
        } else {
            for (int i = 1; i <= n; i++) {
             
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }    
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

               
                System.out.println();
            }
        }
        scanner.close();
    }
}
