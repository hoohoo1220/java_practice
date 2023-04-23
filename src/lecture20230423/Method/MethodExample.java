package lecture20230423.Method;

import java.util.Objects;
import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner inputNum1 = new Scanner(System.in);
        int number1 = inputNum1.nextInt();
        Scanner inputNum2 = new Scanner(System.in);
        int number2 = inputNum2.nextInt();
        Scanner operator = new Scanner(System.in);
        String oper = operator.nextLine();

        int calculateMethodTest = 0;
        calculateMethodTest = calculate(number1, number2, oper);
        System.out.println(calculateMethodTest);
    }

    // 메서드
    /*
        메서드 선언 방법
        접근제어자 static 리턴타입 메서드명(parameter type parameter1, parameter type parameter2 .........) {
            // logic
        }
     */

    public static int calculate(int num1, int num2, String operator) {
        int result = 0;
        if (Objects.equals(operator, "plus")) {
            result = num1 + num2;
        }
        else if (Objects.equals(operator, "minus")) {
            result = num1 - num2;
        }
        else if (Objects.equals(operator, "mult")) {
            result = num1 * num2;
        }
        else if (Objects.equals(operator, "divis")) {
            result = num1 / num2;
        }
        return result;
    }
}
