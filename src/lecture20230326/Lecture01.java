package lecture20230326;

public class Lecture01 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++)
            for (j = 1; j <= 9; j++)
            {
                System.out.print(i + " * " + j +" = "+ i*j +"\t");
                if (j % 9 == 0) {
                    System.out.println("");
                }
            }
    }
}
