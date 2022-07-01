import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.print("2자리 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int sipZari = a / 10;
        int hanZari = a % 10;

        if (sipZari == hanZari) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }

    }
}
