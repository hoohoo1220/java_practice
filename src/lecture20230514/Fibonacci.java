package lecture20230514;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Number(n);
    }

    public static void Number(int n) {
        int[] arr = { 0, 1, 0 };
        int i;
        for (i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (i = 0; i < n; i++) {
            if (n > arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
