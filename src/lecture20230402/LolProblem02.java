package lecture20230402;

public class LolProblem02 {
    public static void main(String[] args) {
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

        System.out.println("게임이 매칭되었습니다.");

        int randomPosition = (int) (Math.random() * 5);
        String[] position = {"탑", "정글", "미드", "원딜", "서폿"};
        int randomTeam = (int) (Math.random() * 2);
        String[] team = {"블루팀", "레드팀"};

        System.out.println("페이커님의 포지션은 " + position[randomPosition] + "이고 " + team[randomTeam] + "입니다.");
    }
}
