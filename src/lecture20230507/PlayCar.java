package lecture20230507;

public class PlayCar {
    public static void main(String[] args) {
        Car a4 = new Car();
        a4.setBrand("Audi");
        a4.setColor("white");
        a4.setYear(2023);
        a4.setPrice(60000000);

        System.out.println("a4의 브랜드는 : " + a4.getBrand());
        System.out.println("a4의 색깔은 : " + a4.getColor());
        System.out.println("a4의 연식은 : " + a4.getYear());
        System.out.println("a4의 가격은 : " + a4.getPrice());

        a4.moveForward();
        a4.moveStop();

        Car m3 = new Car("BMW", "white");
        System.out.println(m3.getBrand() + "   " + m3.getColor());
    }
}
