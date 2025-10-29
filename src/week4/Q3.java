package week4;


//구구단 중 2단부터 9단까지 출력하는 중첩 for문을 작성하세요. 2x3=6 과 같이 형식화된 문자열을 사용
//        하여 출력하세요

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        for(int i=2; i<10; i++){
            for(int j=2; j<10; j++){
                System.out.printf("%d x %d = %d \n", i, j, i*j);
            }
        }
    }

}
