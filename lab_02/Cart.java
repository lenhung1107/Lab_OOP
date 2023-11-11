package lab_02;

import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;  // số lượng tối đa của giỏ hàng ( hằng số )
	private float totalcost = 0;  // tổng giá trị giỏ hàng
	ArrayList<DigitalVideoDisc> itemsOderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);	// Arraylist lưu danh sách các đĩa DVD 
																											//trong giỏ hàng 
	public int qtyOrdered = 0;  // Số lượng thực tế DVD trong giỏ hàng
	
	// Thêm 1 dvd vào giỏ hàng
		public void addDigitalVideoDisc(DigitalVideoDisc disc) {
			// Nếu số lượng chưa max thì có thể thêm
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOderedList.add(disc);
				System.out.println("The disc " + disc.getTitle() + " has been added"); // thoong báo rằng đĩa đc lấy tên( disc.getTitle() )
																						//đã được thêm vào danh sách 
				qtyOrdered = itemsOderedList.size();
			}
			// in ra thêm báo số lượng đĩa thêm vào đã đạt giới hạn 
			else System.out.println("The cart is almost full");
		}
		// tham số truyền vào là mảng
		  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		        for (DigitalVideoDisc disc : dvdList) {
		            addDigitalVideoDisc(disc);
		        }
		        System.out.println("DVDs have been added to the cart.");
		    }
		    
		    // tham số truyền vào là tham số tùy ý
		    public void addDigitalVideoDisc1(DigitalVideoDisc... dvdList) {
		        for (DigitalVideoDisc disc : dvdList) {
		            addDigitalVideoDisc(disc);
		        }
		        System.out.println("DVDs have been added to the cart.");
		    }
		    // với hai tham số truyền vào 
		    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) 
		    {
		    	addDigitalVideoDisc(dvd1);
		    	addDigitalVideoDisc(dvd2);
		    }
	// Xóa 1 dvd khỏi giỏ hàng
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOderedList.size();
	}
	//Tính tổng giá tiền dvd trong giỏ
	public float totalCost() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
			totalcost += itemsOderedList.get(i).getCost();
		}
		return totalcost;
	}
}