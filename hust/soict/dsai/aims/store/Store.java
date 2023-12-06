package hust.soict.dsai.aims.store;
<<<<<<< HEAD

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	
    public static final int MAX_NUMBERS_DVD = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_DVD];
    private int qtyOrdered = 0;
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int n) {
        qtyOrdered += n ;
    }

    public void addDVD(DigitalVideoDisc disc) {
    	//kiểm tra nếu số lượng dvd chwua đạt gưới hạn thì thêm vào
    	
        if(this.getQtyOrdered() != 100) {
            itemsInStore[this.getQtyOrdered()] = disc;
            setQtyOrdered(1);
            System.out.println("The disc " + disc.getTitle() + " has been added");
        }
        else {
            System.out.println(" Almost full");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsInStore[i].getTitle() == disc.getTitle()) {
                for(int j = i; j < qtyOrdered; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                i--;
                setQtyOrdered(-1);
                System.out.println("The disc " + disc.getTitle() + " has been remove");
            }
        }
    }
=======
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.dsai.aims.media.Media;

public class Store {
	
	// Max number of item in store
    public static final int MAX_NUMBERS_DVD = 100;
    
    //ArrayList store items
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    
    // 	Add a media item to the Store
    public void addMedia(Media m) {
        int size = itemsInStore.size();
        //check the store is not already full
        if(size != 100) {
        	//add a media
            itemsInStore.add(m);
            System.out.println("The media has been added");
        }
        else {
        	
            System.out.println("The store is almost full");
        }
    }
    //	Remove Media to Store
    public void removeMedia(Media m) {
        Iterator<Media> iterator = itemsInStore.iterator();
        while (iterator.hasNext()) {
            Media media = iterator.next();
            if (media.getTitle().equals(m.getTitle())) {
                iterator.remove();
                System.out.println("The disc has been removed");
            }
            System.out.println("Media not found in the store");
        }
    }

    //search by ID
    public boolean search(int id) {
        for(Media m: itemsInStore) {
            if(m.getId() == id) {
                return true;
            }
        }
        return false;
    }
    // Search by Title
    public boolean search(String title) {
        for(Media m: itemsInStore) {
            if(m.getTitle() == title) {
                return true;
            }
        }
        return false;
    }

    public Media searchMedia(String title) {
        for(Media m: itemsInStore) {
            if(m.getTitle().equals(title)) {
                return m;
            }
        }
        return null;
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        int i = 1;
        for(Media m: itemsInStore) {
            System.out.println((i) +"   | " + m.getTitle() + " (" + m.getCategory()
                    + ")" + " --- " + m.getCost() + "$");
            i++;
        }
        System.out.println("***************************************************");
    }


>>>>>>> bd76a2c (lab_04)
}