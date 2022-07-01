import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        System.out.print("정수 3개 입력>>");
        Scanner scanner = new Scanner(System.in);

        int[] array=new int[3];
        int temp = 0;

        for (int i = 0; i < 3; i++) {
            array[i]=scanner.nextInt();
        }

        for (int j = 0; j < 2; j++) {

            if(array[j] > array[j+1]) {
                array[j] = temp;
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            temp = 0;
        }

        System.out.println("중간 값은 " + array[1]);

        scanner.close();
    }
}
