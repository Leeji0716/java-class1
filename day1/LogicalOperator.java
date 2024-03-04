package day1;

public class LogicalOperator {
    public static void main(String[] args) {
        //논리연산자

        //&&(AND) : 둘 다 true 일 때, true
        //둘 중 하나라도 false 라면 false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println();

        //||(OR) : 둘 다 false 일 때, false
        //둘 중 하나라도 true 라면 true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println();

        System.out.println(true || false || true || false);
        // -> true
        System.out.println(10 > 20 && 1 != 1 && 3 > 2);
        //false && false && true -> false
    }
}
