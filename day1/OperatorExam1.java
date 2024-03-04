package day1;

public class OperatorExam1 {
    public static void main(String[] args) {

        if ( true ) {
            System.out.println("true");
        }//출력

        if ( false ) {
            System.out.println("false");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("true");
        }//출력

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("false");
        }

        if ( a > 10 ) {
            System.out.println("false");
        }

        if ( a >= 10 ) {
            System.out.println("ture");
        } // 출력

        int b = 10;

        if ( a == b ) {
            System.out.println("true");
        } //출력

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println("false");
        }

        if ( c == false ) {
            System.out.println("true");
        }//출력

        // `!` => 반전
        if ( !c ) {
            System.out.println("true");
        }//출력

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("false");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("true");
        }//출력
    }
}
