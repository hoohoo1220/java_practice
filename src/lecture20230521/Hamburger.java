package lecture20230521;

import java.util.Objects;
import java.util.Scanner;

public class Hamburger {
    public static void main(String[] args) {
        System.out.println("1. 빅맥        6000");
        System.out.println("2. 상하이      6000");
        System.out.println("3. 골든에그    10000");
        System.out.println("4. 맥윙        3000");
        System.out.println("5. 치즈        2000");
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        if (Objects.equals(order, "0")) {
            System.out.println();
        }
        else {
            money(order);
        }
    }
    public static void money(String order) {
        if (Objects.equals(order, "1번")) {
            System.out.println((int)(6000 * 0.1 + 6000));
        }
        else if (Objects.equals(order, "1번세트")) {
            System.out.println((int)((6000+2000) * 0.1 + 6000));
        }
        else if (Objects.equals(order, "2번")) {
            System.out.println((int)((6000 * 0.1 + 6000)));
        }
        else if (Objects.equals(order, "2번세트")) {
            System.out.println((int)((6000+2000) * 0.1 + 6000));
        }
        else if (Objects.equals(order, "3번")) {
            System.out.println((int)(10000 * 0.1 + 10000));
        }
        else if (Objects.equals(order, "3번세트")) {
            System.out.println((int)((10000+2000) * 0.1 + 10000));
        }
        else if (Objects.equals(order, "4번")) {
            System.out.println((int)(3000 * 0.1 + 3000));
        }
        else if (Objects.equals(order, "4번세트")) {
            System.out.println((int)((3000+2000) * 0.1 + 3000));
        }
        else if (Objects.equals(order, "5번")) {
            System.out.println((int)(2000 * 0.1 + 2000));
        }
        else if (Objects.equals(order, "5번세트")) {
            System.out.println((int)((2000+2000) * 0.1 + 2000));
        }
    }
}
