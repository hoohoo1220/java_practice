package lecture20230326;

public class Lecture04 {
    public static void main(String[] args) {
        int i, t = 0, m = 0;
        while (t < 24) {
            System.out.println(t + "시 " + m + "분");
            m += 1;
            if (m == 60) {
                m = 0;
                t++;
            }
        }
    }
}
