package week5;


//switch 문을 사용하여 요일 코드(1~7)를 입력받고, 월요일~일요일 중 하나를 출력하세요. 1~7 범위 이
//외의 값을 입력받는 경우 잘못된 요일 코드를 출력하세요. (int day = 3 처럼 임의로 day 초기화
//

public class week5 {
    public static void main(String[] args) {

        String[] strarr = new String[3];

        strarr[0] = "asd";
        strarr[1] = "asd";
        strarr[2] = new String("asd");

        System.out.println(strarr[0] == strarr[1]);
        System.out.println(strarr[0] == strarr[2]);
        System.out.println(strarr[0].equals(strarr[2]));

        String[] strarr2 = new String[6];
//        for(int i=0;i<strarr.length;i++){
//            strarr2[i] = strarr[i];
//        }
//
//        for(int i=0;i<strarr2.length;i++){
//            System.out.println(strarr2[i]);
//        }

        System.arraycopy(strarr, 0, strarr2, 0, 3);

        for(int i=0;i<strarr2.length;i++){
            System.out.println(strarr2[i]);
  }
    }

}
