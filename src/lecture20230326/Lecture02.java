package lecture20230326;

public class Lecture02 {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i=1;i<1000;i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            else if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
