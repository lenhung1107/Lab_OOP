package lab_01;


import javax.swing.JOptionPane;

public class equation {
  public static void main(String[] args) {
  	String strNum1, strNum2;
 
      strNum1 = JOptionPane.showInputDialog(null, "Le Thi Nhung 20210662 - Please input the first number: ", "Input the first number",
      		                               JOptionPane.INFORMATION_MESSAGE);
      strNum2 = JOptionPane.showInputDialog(null, "Le Thi Nhung 20210662 - Please input the second number: ", "Input the second number",
      		                              JOptionPane.INFORMATION_MESSAGE);
      double num1 = Double.parseDouble(strNum1);
      double num2 = Double.parseDouble(strNum2);
    
      System.out.println("Le Thi Nhung 20210662 - Sum of two inputs is "+(num1+num2)+"\n");
      System.out.println("Le Thi Nhung 20210662 - Dif of two inputs is "+(num1-num2)+"\n");
      System.out.println("Le Thi Nhung 20210662 - Product of two inputs is "+(num1*num2)+"\n");
      if(num2==0)
      	System.out.println("Le Thi Nhung 20210662 - Unidentified");
      else
      {
      	 System.out.println("Le Thi Nhung 20210662 - Quotient of two inputs is "+(num1/num2)+"\n");
      }
     
}
}
