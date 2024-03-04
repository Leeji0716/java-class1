package day1;

public class Operator { //연산자
    public static void main(String[] args) {
        //산술연산자 : +, -, *, /, %
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 3);      // 정수와 정수의 계산 결과는 정수.
        System.out.println(10.0 / 3.0);  //실수로 계산하려면 실수
        System.out.println(10 % 3);      //나머지

        //비교연산자 : <, <=, >, >=, ==, !=
        //true, false --> 논리값(boolean)으로 결과가 나온다.
        System.out.println(10 > 5);
        System.out.println(10 < 5);

        System.out.println(5 == 5); //true
        System.out.println(5 != 5); //false
    }
}
