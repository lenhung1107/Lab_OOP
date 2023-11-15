package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tao 2 DVD moi
		System.out.println("Lê Thị Nhung - 20210662");
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		// Doi noi dung
		swap(jungleDVD, cinderellaDVD);
		// In title
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		// Doi title
		swapcorrect(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	// swap noi dung cua 2 object (slide)
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	// xay dung lai phuong thuc swap dung 
	public static void swapcorrect(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    String tmpTitle = dvd1.getTitle();
	    dvd1.setTitle(dvd2.getTitle());
	    dvd2.setTitle(tmpTitle);
	}
}

	
	// doi title cua DVD
//	public static void changeTitle(DigitalVideoDisc dvd, String title) {
//		String oldTitle = dvd.getTitle();
//		dvd.setTitle(title);
//		dvd = new DigitalVideoDisc(oldTitle);
//	}
//
//}