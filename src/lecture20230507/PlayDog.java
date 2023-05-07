package lecture20230507;

public class PlayDog {
    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.printf("이름: %s\n", d.name);
        System.out.printf("품종: %s\n", d.breeds);
        System.out.printf("나이: %s\n", d.age);
    }
}
