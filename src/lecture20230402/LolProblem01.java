package lecture20230402;

import java.util.Objects;
import java.util.Scanner;

public class LolProblem01 {
    public static void main(String[] args) {
        Scanner StartMatch = new Scanner(System.in);
        System.out.println(("게임을 시작하시겠습니까? 1)네, 2)아니요"));
        //문자열 입력
        String MatchAnswer = StartMatch.nextLine();
        if (Objects.equals(MatchAnswer, "네")) {
            System.out.println(MatchAnswer + ", 매칭을 시작하겠습니다");
        }

        System.out.println("게임이 매칭되었습니다.");
        String[] position = {"탑", "정글", "미드", "원딜", "서폿"};
        int randomNumber = (int) (Math.random() * 5);
        System.out.println("페이커님의 포지션은 " + position[randomNumber] + " 입니다.");
    }
}
