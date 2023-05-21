package lecture20230521;

import java.util.Objects;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        bill(money);
    }
    public static void bill(int money) {
        int cnt50000 = 0, cnt10000 = 0, cnt5000 = 0, cnt1000 = 0, cnt500 = 0, cnt100 = 0, cnt50 = 0, cnt10 = 0, cnt5 = 0, cnt1 = 0;
        if (money > 50000) {
            System.out.println("50000원 권 " + money / 50000 + "매");
            cnt10000 = money - 50000 * (money / 50000);
        }
        if (cnt10000 > 10000) {
            System.out.println("10000원 권 " + cnt10000 / 10000 + "매");
            cnt5000 = cnt10000 - 10000 * (cnt10000 / 10000);
        }
        if (cnt5000 > 5000) {
            System.out.println("5000원 권 " + cnt5000 / 5000 + "매");
            cnt1000 = cnt5000 - 5000 * (cnt5000 / 5000);
        }
        if (cnt1000 > 1000) {
            System.out.println("1000원 권 " + cnt1000 / 1000 + "매");
            cnt500 = cnt1000 - 1000 * (cnt1000 / 1000);
        }
        if (cnt500 > 500) {
            System.out.println("500원 권 " + cnt500 / 500 + "매");
            cnt100 = cnt500 - 500 * (cnt500 / 500);
        }
        if (cnt100 > 100) {
            System.out.println("100원 권 " + cnt100 / 100 + "매");
            cnt50 = cnt100 - 100 * (cnt100 / 100);
        }
        if (cnt50 > 50) {
            System.out.println("50원 권 " + cnt50 / 50 + "매");
            cnt10 = cnt50 - 50 * (cnt50 / 50);
        }
        if (cnt10 > 10) {
            System.out.println("10원 권" + cnt10 / 10 + "매");
            cnt5 = cnt10 - 10 * (cnt10 / 10);
        }
        if (cnt5 > 5) {
            System.out.println("5원 권 " + cnt5 / 5 + "매");
            cnt1 = cnt5 - 5 * (cnt5 / 5);
        }
        if (cnt1 > 1) {
            System.out.println("1원 권 " + cnt1 + "매");
        }
    }
}
