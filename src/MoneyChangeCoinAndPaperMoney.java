import java.util.Scanner;
public class MoneyChangeCoinAndPaperMoney {
    public static void main(String[] args) {
        System.out.print("금액을 입력하시오>>");
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int temp = 0;

        int Paper50 = money / 50000;
        temp = money % 50000;

        int Paper10 = temp / 10000;
        temp = temp % 10000;

        //int Paper5 = temp / 5000;
        //temp = temp % 5000;

        int Paper1 = temp / 1000;
        temp = temp % 1000;

        //int Coin500 = temp / 500;
        //temp = temp % 500;

        int Coin100 = temp / 100;
        temp = temp % 100;

        int Coin50 = temp / 50;
        temp = temp % 50;

        int Coin10 = temp / 10;
        temp = temp % 10;

        System.out.println("오만원권 " + Paper50 + "매");
        System.out.println("만원권 " + Paper10 + "매");
        //System.out.println("오천원권 " + Paper5 + "매");
        System.out.println("천원권 " + Paper1 + "매");
        System.out.println("백원 " + Coin100 + "개");
        System.out.println("오십원 " + Coin50 + "개");
        System.out.println("십원 " + Coin10 + "개");
        System.out.println("일원 " + temp + "개");



    }
}
