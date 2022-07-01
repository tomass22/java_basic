import java.util.Scanner;

public class ChageDon {
    public static void main(String[] args) {
        System.out.print("원화를 입력하세요(단위 원)>>");
        Scanner scanner = new Scanner(System.in);

        int won = scanner.nextInt();
        double dollar = won / 1100;

        System.out.println(won + "은 $" + dollar + "입니다.");
    }
}
