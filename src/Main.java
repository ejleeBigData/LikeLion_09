import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.printf("나이 : %d, 이름 : %s", age, name);
    }
}