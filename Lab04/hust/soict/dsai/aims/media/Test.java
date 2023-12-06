package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
    public static void main(String args[]) {
    	System.out.println("Lê Thị Nhung 20210662");
        List<Media> media = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        Book book = new Book();

        CompactDisc cd = new CompactDisc();

        media.add(cd);
        media.add(dvd);
        media.add(book);

        for(Media m: media) {
            System.out.println(m.toString());
        }
    }
}