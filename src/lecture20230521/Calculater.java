package lecture20230521;

import java.util.Objects;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String operate = scanner.nextLine();
        int b = scanner.nextInt();
        calculate(a, operate, b);
    }

    public static void calculate(int a, String operate, int b) {
        if (Objects.equals(operate, "+")) {
            System.out.println(a + b);
        }
        else if (Objects.equals(operate, "-")) {
            System.out.println(a - b);
        }
        else if (Objects.equals(operate, "*")) {
            System.out.println(a * b);
        }
        else if (Objects.equals(operate, "/")) {
            System.out.println(a / b);
        }
    }
}
