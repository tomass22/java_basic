import java.util.Scanner;

public class ReturnArray {

    int[] makeArray() {
        Scanner scanner = new Scanner(System.in);
        int temp [] = new int[4];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = scanner.nextInt();
        }
        scanner.close();
        return temp;
    }

    public static void main(String[] args) {
        ReturnArray a=new ReturnArray();
        int intArray[]; // 배열 레퍼런스 변수 선언
        intArray = a.makeArray();
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }
    }
}
