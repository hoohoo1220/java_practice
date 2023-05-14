package lecture20230514;

public class Factorial {
    public static void main(String[] args) {

    }
    public static void Number(int n) {
        int[] arr = new int[100];
        int i;
        arr[0] = 0;
        arr[1] = 1;
        for (i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (i = 0; i < n; i++) {
            if (n > arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
