package lecture20230402;

import java.util.Scanner;

public class Lecture01 {
    public static void main(String[] args) {

        //클래스 -> 사용자 정의타입
        //클래스 -> 미리 만들어진 클래스 타입
        //클래스 변수명 = new 클래스();
        //입력
        Scanner InputN = new Scanner(System.in);

        System.out.println("나이를 입력하세요.");
        //정수 입력
        int InputAge = InputN.nextInt();
        System.out.println("입력된 나이는 : " + InputAge);

        Scanner InputS = new Scanner(System.in);
        System.out.println(("문자열을 입력해주세요."));
        //문자열 입력
        String InputStr = InputS.nextLine();
        System.out.println("입력된 문자열은 : " + InputStr);

        //변수 선언
        //type 변수명 = 초기값;
        int number = 0;
    }
}
