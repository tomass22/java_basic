public class ForEachEx {
    enum Week { 월, 화, 수, 목, 금, 토, 일 } // ???

    public static void main(String[] args) {
        int [] n = { 1, 2, 3, 4, 5 };
        String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

        int sum = 0;
        // 아래 for-each에서 k는 n[0], n[1], ..., n[4]로 반복
        for (int k : n) {
            System.out.print( k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum  );

        // 변수는 왼쪽 변수가 가지는 자료형과 동일해야 된다.
        // 왼쪽 레퍼런스 변수가 가르키는 배열 공간의 값을 가져오는 것이기 때문이다.
        for (String s : names )
            System.out.print(s + " ");
        System.out.println();

        // 아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복
        // 아직 무슨의미인지???
        for ( Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();

    }
}
