package lab_01;
import java.util.Scanner;
public class AddTwomatrixrix {
   
    public static void show(int[][] matrix, int n, int m) { /* ham in ra ma tran vơi tham so dau vao là mot mang 
    											hai chiều kiểu dữ liệu int */
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }}
        public static void main(String[] args) {
        	System.out.println("Lê Thị Nhung 20210662");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap vao so hang ma tran: ");
        int n = sc.nextInt();
        System.out.print("Nhap vao so cot ma tran: ");
        int m = sc.nextInt();
        int[][] matrix_1 = new int[n][m]; // khai bao mang hai chieu kieu du lieu int với n hàng, m cột
        int[][] matrix_2 = new int[n][m];
        int[][] sum = new int[n][m];
        
        System.out.print("Nhap vao cac phan tu cua ma tran thu nhat: \n");
        // với n hàng, m cột thực hiện việc nhập vào các phần tử của hai ma trận
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ",i,j);
                matrix_1[i][j] = sc.nextInt();
            }}
        System.out.print("Nhap vao cac phan tu cua ma tran thu hai: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("b[%d][%d] = ",i,j);
                matrix_2[i][j] = sc.nextInt();
            }}
       // thực hiện công việc tính tổng hai ma trận
        for(int i = 0; i<n;i++) {
            for (int j= 0; j<m;j++) {
                sum[i][j]=matrix_1[i][j] + matrix_2[i][j]; 
            } }
        // in ra ma trận thứ nhất được nhập vào
        System.out.println("Ma tran thu nhat la: ");
        show(matrix_1,n,m);
     // in ra ma trận thứ nhất được nhập vào
        System.out.println("Ma tran thu hai la: ");
        show(matrix_2,n,m);
     // in ra ma trận lưu trữ giá trị khi thực hiện công việc tổng giữa hai ma trận được nhập vào
        System.out.println("Tong hai ma tran la ");
        show(sum,n,m);
    }
}