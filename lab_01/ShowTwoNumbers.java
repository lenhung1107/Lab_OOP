package lab_01;

import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Le Thi Nhung 20210662 - You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null, "Le Thi Nhung 20210662 - Please input the first number: ", "Input the first number", 
        										JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Le Thi Nhung 20210662 - Please input the second number: ", "Input the second number", 	
        										JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Le Thi Nhung 20210662 - Show two numbers", 
        								JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}