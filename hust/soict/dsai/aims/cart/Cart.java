package hust.soict.dsai.aims.cart;
<<<<<<< HEAD

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

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
	
	//in ra cart kèm id 
	public void listCart(){
        for(int i = 0 ; i < qtyOrdered ; i++) System.out.println("id: "+ itemsOderedList.get(i).getId() +
                " " + itemsOderedList.get(i).getTitle());
	}
	//tìm kiếm cart theo id
	 public boolean searchid(int id) {
	        int n = qtyOrdered;
	        for(int i = 0; i < n; i++) {
	            if(itemsOderedList.get(i).getId() == id) {
	                return true;
	            }
	        }
	        return false;
	    }
	    // tìm kiếm theo title
	    public boolean searchtt(String title) {
	        int n = qtyOrdered;
	        for(int i = 0; i < n; i++) {
	            if(itemsOderedList.get(i).getTitle() == title) {
	                return true;
	            }
	        }
	        return false;
	    }
	//in ra thông tin cart theo yêu cầu đề bài
        public void printCart() {
            System.out.println("***********************CART***********************");
            System.out.println("Ordered Items:");

            for (int i = 0; i < qtyOrdered; i++) {
                DigitalVideoDisc dvd = itemsOderedList.get(i);
                System.out.printf("%d. DVD - %s - %s - %s - %d minutes: %.2f $\n", i + 1, dvd.getTitle(),
                        dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
            }
            float totalCost = totalCost();
            System.out.printf("Total cost: %.2f $\n",totalCost);
        }
            public void print(int num) {
                System.out.println("***********************CART***********************");
                System.out.println("Ordered Items:");

               // for (int i = 0; i < qtyOrdered; i++) {
                    DigitalVideoDisc dvd = itemsOderedList.get(num-1);
                    System.out.printf(" %s - %s - %s - %d minutes: %.2f $\n", dvd.getTitle(),
                            dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
                
            }

           
           
    }
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;

public class Cart {
	//max number of order
    public static final int MAX_NUMBERS_ORDERED = 20;
   //arrayList store orders
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();


    public ArrayList<Media>  getOrderedList(){
        return itemsOrdered;
    }

   
    // Add a media item to the list
    public void addMedia(Media m) {
        int size = itemsOrdered.size();
        if(size != MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(m);
            System.out.println("The media  has been added");
        }
        // can't add media item to the list
        else {
            System.out.println("The cart is almost full");
        }
    }
    // Remove Media to Cart
    public void removeMedia(Media m) {
        Iterator<Media> iterator = itemsOrdered.iterator();
        while (iterator.hasNext()) {
            Media media = iterator.next();
            if (media.getTitle().equals(m.getTitle())) {
                iterator.remove();
                System.out.println("The disc has been removed");
            }
        }
        System.out.println("The media does not exist in the cart.");
    }

    //	Total Cost of Card
    public float totalCost() {
        float total = 0;
        for(Media m: itemsOrdered) {
            total =total+ m.getCost();
        }
        return total;
    }

   
    public void listCard()
    {
    	for(Media m : itemsOrdered)
    	{
    		System.out.println("id "+m.getId() +" "+m.getTitle());
    		
    	}
    }
    // Search by ID
    public boolean search(int id) {
        for(Media m: itemsOrdered) {
            if(m.getId() == id) {
                return true;
            }
        }
        return false;
    }
    // Search by Title
    public boolean search(String title) {
        for(Media m: itemsOrdered) {
            if(m.getTitle() == title) {
                return true;
            }
        }
        return false;
    }
    // Print Cart
    public void printCart() {
    	System.out.println("Le Thi Nhung 20210662");
        System.out.println("--------------CART---------------");
        System.out.println("Ordered Items:");
       
        for (Media m : itemsOrdered) {
            System.out.printf("id : %d. %s \n", m.getId(),m.getTitle());
        }

        float totalCost = totalCost();
        System.out.println("-------------------------------------");
        System.out.printf("===> Total cost: %.2f $\n", totalCost);
        System.out.println("------------------------------------------");
    }


    public void printLength() {
        System.out.println(itemsOrdered.size());
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, new Comparator<Media>() {
            @Override
            public int compare(Media media1, Media media2) {
                return media1.getTitle().compareTo(media2.getTitle());
            }
        });
        System.out.println("Cart sorted by title.");
        printCart();
    }
    public void sortByCost() {
        Collections.sort(itemsOrdered, new Comparator<Media>() {
            @Override
            public int compare(Media media1, Media media2) {
                return Float.compare(media1.getCost(), media2.getCost());
            }
        });
        System.out.println("Cart sorted by cost.");
        printCart();
    }

    public Media searchMedia(String title) {
        for(Media m: itemsOrdered) {
            if(m.getTitle().equals(title)) {
                return m;
            }
        }
        return null;
    }
}
>>>>>>> bd76a2c (lab_04)
