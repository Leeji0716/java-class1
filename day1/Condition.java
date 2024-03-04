package day1;

public class Condition {
    public static void main(String[] args) {
        //조건문
        int a = 10;
        if (a > 50){
            System.out.println("high");
        }else {
            System.out.println("low");
        }

        //예제
        //소지금에 따른 야식 메뉴

        //20000원 이상 : 치킨
        //20000원 미만 : 떡볶이

        int money = 20000;

        if (money >= 20000){
            System.out.println("치킨먹쟈");
        }else {
            System.out.println("떡볶이 먹쟈");
        }

        //1. 맑음 / 2. 흐림 / 3. 비 / 4. 눈
        int weather = 3;

        if (weather == 1){
            System.out.println("날씨가 맑습니다. 나들이 가세요");
        }else if (weather == 2){
            System.out.println("날씨가 흐립니다. 집에 계세요");
        }else if (weather == 3){
            System.out.println("날씨가 비옵니다. 우산을 챙기세요");
        }else {
            System.out.println("날씨가 눈옵니다. 눈사람을 만드세요");
        }
    }
}
