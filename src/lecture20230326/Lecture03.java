package lecture20230326;

public class Lecture03 {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i=1;i<=100;i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
