package week4;


//switch 문을 사용하여 요일 코드(1~7)를 입력받고, 월요일~일요일 중 하나를 출력하세요. 1~7 범위 이
//외의 값을 입력받는 경우 잘못된 요일 코드를 출력하세요. (int day = 3 처럼 임의로 day 초기화
//

public class Q1 {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1 -> System.out.print("일요일\n");
            case 2 -> System.out.print("월요일\n");
            case 3 -> System.out.print("화요일\n");
            case 4 -> System.out.print("수요일\n");
            case 5 -> System.out.print("목요일\n");
            case 6 -> System.out.print("금요일\n");
            case 7 -> System.out.print("토요일\n");
            default -> System.out.print("잘못된 코드!\n");

        }
    }

}
