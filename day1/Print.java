package day1;

public class Print {
    public static void main(String[] args) {
        //숫자 문자 아무거나 10개 출력
        System.out.println("내 이름은");
        System.out.println("이지영");
        System.out.println("내 나이는");
        System.out.println(24 + "살");
        System.out.println("오늘 날짜는");
        System.out.println(240304);
        // sysout --> s + enter

        System.out.println("안녕하세요 \n반갑습니다.");

        System.out.println("안녕하세요. 이지영입니다.");
        //문자열 합치기
        System.out.println("안녕하세요." + " 이지영입니다");
        System.out.println("안녕하세요." + " 이지영입니다." + " 반갑습니다.");

        //숫자 더하기 (산술 연산)
        System.out.println(100 + 200);
        System.out.println(2000 + 3000);

        //숫자와 문자는 정확히 구별하여 사용
        System.out.println("100" + "200");  //문자
        System.out.println(100 + 200);      //숫자(자료형)

        //문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100 " + 200);

        //출력문을 이용해 더하기 식 표현하기
        System.out.println("100 + 200 = 300");
        //+ 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        //문자와 숫자가 공존할 때, 숫자는 괄호로 묶어주어야 연산함
        System.out.println("100 + 200 = " + (100+200));

        //숫자 곱하기 (*)
        System.out.println(100 * 200);

        //구구단 2단을 출력. 단, 출력문은 한번만 사용.
        for (int a = 1; a < 10; a++){
            System.out.println("2 X " + a +" = "+ (2 * a));
        }
        //System.out.println("2 x 1 = " + (2*1) + "\n2 x 2 = " + (2*2) + "\n2 x 3 = " + (2*3) + "\n2 x 4 = " + (2*4) );


    }
}
