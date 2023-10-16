package lab_01;

import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
    	System.out.println("Lê Thị Nhung 20210662");
    	// gán mang 31 ngay bang nhung cach goi ten khac
        String[]thang_31days = {"January", "Jan.", "Jan", "1",
                "March", "Mar.", "Mar", "3",
                "May", "5",
                "July", "Jul", "7",
                "August", "Aug.", "Aug", "8",
                "October", "Oct.", "Oct", "10",
                "December", "Dec.", "Dec", "12"};
     // gán mang 30 ngay bang nhung cach goi ten khac
        String[] thang_30days = {"April", "Apr.", "Apr", "4",
                "June", "Jun", "6", 
                "September", "Sept.", "Sep", "9",
                "November", "Nov.", "Nov", "11"};
     // gán mang thang bang nhung cach goi ten khac vì tháng hai là tháng đặc biệt
        String[] thang_2 = {"February", "Feb.", "Feb", "2"};
        int Year;
        while(true) {
            while(true){
                System.out.print("Nhập vào năm : ");
                Scanner year = new Scanner(System.in);
                Year = year.nextInt(); // nhap vao nam 
                
                if(Year >= 0){
                    break;
                }else {
                	System.out.println(" Nhập sai!!! Yêu cầu nhập lại ");
                    continue;
                }
            }
            System.out.print("Enter the month: ");
            // yêu cầu nhập vào tháng
            Scanner month = new Scanner(System.in);
            String strMonth = month.nextLine();
            for(String s :thang_31days) {
            	/*  equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi.
            	Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.*/
                if(s.equals(strMonth)) {
                    System.out.println("Tháng "+ s+" "+ "Năm " + Year + " có số ngày là: 31");
                    System.exit(0);
                }
            }

            for(String s : thang_30days) {
                if(s.equals(strMonth)) {
                    System.out.println("Tháng "+ s+" "+ "Năm " + Year + " có số ngày là: 30");
                    System.exit(0);
                }
            }

            for(String s : thang_2) {
                if(s.equals(strMonth)) {
                	//Kiểm tra năm nhuận 
                    if(Year%4 == 0 && Year%100 != 0||Year%400==0) {
                        System.out.println("Tháng "+ s+" "+ "Năm " + Year + " có số ngày là: 29");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Tháng "+ s+" "+ "Năm " + Year + " có số ngày là: 28");
                        System.exit(0);
                    }
                }
            }
            System.out.println("Lỗi!!! Yêu cầu nhập lại");
        }
    }
}