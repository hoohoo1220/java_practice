package lecture20230507;

public class SquareTest {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.length = 4;
        sq.area(sq.length);
    }
}

class Square {
    int length;
    void area(int length) {
        System.out.println("한 변의 길이가 " + length + "인 정사각형의 넓이 : " + length*length);
    }
}