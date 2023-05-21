package lecture20230521;

public class Seven {
    public static void main(String[] args) {
        int[] a = { 106, -204, -337, -80, -62, 30, 457, 166, 317, 358 };
        mini(a);
    }
    public static void mini(int[] a) {
        int min, n;
        if (a[0] > 7) {
            min = a[0] - 7;
        }
        else {
            min = 7 - a[0];
        }
        n = 0;
        for (int i = 1; i < 10; i++) {
            if (a[i] > 7) {
                if (min > a[i] - 7) {
                    min = a[i] - 7;
                    n = i;
                }
            }
            else {
                if (min > 7 - a[i]) {
                    min = 7 - a[i];
                    n = i;
                }
            }
        }
        System.out.println("7과 가장 차이가 적게 나는 수는 " + a[n] + "입나다.");
    }
}
