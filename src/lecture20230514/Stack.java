package lecture20230514;

import java.util.Objects;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        int cnt = 0;
        int[] arr = new int [5];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (Objects.equals(input, "push")) {
                int num = scanner.nextInt();
                arr[cnt] = push(num);
                cnt++;
            }
            else if (Objects.equals(input, "pop")) {
                System.out.println(arr[cnt]);
                arr[cnt] = pop();
                cnt--;
            }
            else if (Objects.equals(input, "size")) {
                System.out.println(cnt + 1);
            }
            else if (Objects.equals(input, "empty")) {
                System.out.println(empty(cnt));
            }
            else if (Objects.equals(input, "top")) {
                System.out.println(arr[top(cnt)]);
            }
        }
    }


    public static int push(int n){
        return n;
    }

    public static int pop() {
        return '\n';
    }

    public static int empty(int i) {
        if (i == -1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int top(int i) {
        return i;
    }
}