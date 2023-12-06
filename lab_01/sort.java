package lab_01;
import java.util.Arrays;
import java.util.Scanner;
public class sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap vao do dai cua mang");
		int n=sc.nextInt();
		System.out.println("nhap vao cac phan tu cua mang");
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 Arrays.sort(a);
		 System.out.println("mang a khi duoc sap xep la");
		 for(int i=0;i<n;i++)
		 { 
			 System.out.println(a[i]+" ");
		 }
		 int sum=0;
		 for(int i: a)
		 {
			 sum=sum+i;
		 }
		 System.out.println("tong cac phan tu cua mang la "+sum+"");
		 System.out.println("trung binh tong cua mang so la "+ (float)(sum/n) );
	}
}
