package lab_02;

public class Aims {

    public static void main(String[] args) {
        // Tạo một giỏi hàng mới
        Cart anOrder = new Cart();

        // Tạo 3 đĩa mới với thông tin: tiêu đề, danh mục, chi phí, đạo diễn và độ dài
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        
        // add 3 đĩa trên vào giỏi hàng
        anOrder.addDigitalVideoDisc(dvd3);

        //Xoa đĩa thứ 2 ra khỏi giỏ hàng.
        anOrder.removeDigitalVideoDisc(dvd2);


        // tổng giá tiền trả cho giỏ hàng 
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }

}
