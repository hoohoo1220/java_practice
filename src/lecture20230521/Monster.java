package lecture20230521;

import java.util.Scanner;

public class Monster {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        int cnt = 10;
        for (int i = 0; i < 5; i++) {
            game(a);
        }
        System.out.println("실패..");
    }
    public static void game(int a) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            if (a > n) {
                System.out.println("난수 몬스터의 숫자가 더 큽니다..");
            } else if (a < n) {
                System.out.println("난수 몬스터의 숫자가 더 작습니다.");
            } else {
                System.out.println("!!!!! 난수 몬스터를 잡았습니다.");
            }
    }
}
