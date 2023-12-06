package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // tạo class variables để quản lí Ids và số lượng DVD
    private static int nbDigitalVideoDiscs = 0;

    // biến Instance cho ID
    private int id;

   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    
    public int getId() {
        return id;
    }

   
    public DigitalVideoDisc() {
        // Tăng số lượng DVD và gán id 
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    
    public DigitalVideoDisc(String title) {
        this(); 
        this.title = title;
    }

   
    public DigitalVideoDisc(String title, String category, float cost) {
        this(); 
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(); 
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

   
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
// lấy số lượng đĩa 
    public int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    public void setId() {
        id = getNbDigitalVideoDiscs();
        nbDigitalVideoDiscs++;
    }
}