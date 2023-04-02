package lecture20230402;

import java.util.Scanner;

public class LolProblem03 {
    public static void main(String[] args) {
        int i, j;

        System.out.print("파티원의 수를 정해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int FriendNumber = scanner.nextInt();
        String[] party = {"파티원1", "파티원2", "파티원3", "파티원4"};
        String[] extra = {"외부인1", "외부인2", "외부인3", "외부인4"};
        int extraNumber = 5 - FriendNumber;
        int partyNumber = 4 - extraNumber;

        System.out.println();
        System.out.println("게임을 선택해 주세요.");
        System.out.println("1. 일반게임");
        System.out.println("2. 랭크게임");
        System.out.println("3. 우르프");
        System.out.println("4. 단일챔피언");
        System.out.println("5. AI");
        System.out.println();

        String[] mode = {"일반게임", "랭크게임", "우르프", "단일챔피언", "AI"};
        int randomMode = (int) (Math.random() * 5);

        System.out.println(mode[randomMode] + "을 선택했습니다. " + mode[randomMode] + " 매칭을 하겠습니다.");
        System.out.println();

        System.out.println("게임이 매칭되었습니다.");

        int randomTeam = (int) (Math.random() * 2);
        String[] team = {"블루팀", "레드팀"};
        System.out.println("팀 진영은 " + team[randomTeam] + "입니다.");

        int[] numbers = new int[5];
        String[] position = {"탑", "정글", "미드", "원딜", "서폿"};
        int randomPosition = (int) (Math.random() * 5);

        for (i = 0; i < 5; i++) {
            numbers[i] = randomPosition;
            for (j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i-=1;
                }
            }
        }

        System.out.println("페이커님의 포지션은 " + position[numbers[0]]);
        for (i = 0; i < partyNumber; i++) {
            System.out.println(party[i] + "의 포지션은 " + position[numbers[i+1]]);
        }
        for (i = 0; i < extraNumber; i++) {
            System.out.println(extra[i] + "의 포지션은 " + position[numbers[5-partyNumber+i]]);
        }
        System.out.println("");
    }
}
