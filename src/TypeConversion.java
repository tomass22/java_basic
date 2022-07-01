import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
//        byte b = 127;
//        int i = 100;
//        System.out.println(b+i); //b가 int 타입으로 자동 변환
//        System.out.println(10/4); // 정수 나누기 -> 결과는 2
//        System.out.println(10.0/4); // 실수/정수 이므로 4가 더 큰 타입의 4.0으로 변환 -> 결과는 2.5
//        System.out.println((char)0x12340041); // char로 변환된 결과 문자 'A'
//        System.out.println((byte)(b+i)); //b+i는 227, 16진수
//        System.out.println((int)2.9 + 1.8); // -> 2+1.8 = 3.8
//        System.out.println((int)(2.9 + 1.8)); // 4
//        System.out.println((int)2.9 + (int)1.8); // 3
        Scanner name=new Scanner(System.in);
        int a=name.nextInt();
        System.out.println(a);
    }
}
