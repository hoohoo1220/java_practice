package lecture20230507;

public class Car {

    //field

    private String brand;

    private int year;

    private String color;

    private int price;

    //생성자 Constructor

    Car() {}

    //생성자 오버로딩

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Car(String brand, int year, String color, int price) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void moveForward() {
        System.out.println("전진합니다.");
    }
    public void moveStop() {
        System.out.println("정지합니다.");
    }
    public void moveBackward() {
        System.out.println("후진합니다.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
