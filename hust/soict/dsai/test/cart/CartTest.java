package hust.soict.dsai.test.cart;
<<<<<<< HEAD

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
        System.out.println("Lê Thị nhung 20210662");
        Cart cart = new Cart();
        // tạo các dvd và thêm vào danh sách
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.printCart();
        
        Scanner keyboard = new Scanner(System.in);
        int n=keyboard.nextInt();
        //tìm kiếm cart theo id 
        if(cart.searchid(n))
        {
        	cart.print(n);
        }
        else
        	System.out.println("No result found");
       
    }
}
=======
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
//        // Create a new hust.soict.dsai.aims.cart.Cart
//        Cart cart = new Cart();
//        // Create new dvd Object and add them to the hust.soict.dsai.aims.cart.Cart
//        // Create new dvd1
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        cart.addDigitalVideoDisc(dvd1);
//
//        // Create new dvd2
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        cart.addDigitalVideoDisc(dvd2);
//
//        // Create new dvd3
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//        cart.addDigitalVideoDisc(dvd3);
//
//        // Test the method print hust.soict.dsai.aims.cart.Cart
//        cart.printCart();
//        // To-do: Test the search methods here
    }
}
>>>>>>> bd76a2c (lab_04)
