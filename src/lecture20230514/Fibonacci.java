package lecture20230514;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Number(n);
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
