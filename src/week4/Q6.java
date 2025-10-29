package week4;


//사용자로부터 양의 정수 num을 입력받고, n이 소수인지 아닌지 판단하는 코드를 작성하세요. 소수이면
//소수입니다, 소수가 아니면 소수가 아닙니다를 출력하세요.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        System.out.print("숫자 입력: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean prime =  true;

        if(num == 1){prime = false;}

        for(int i=2; i<num-1; i++){
            if(num%i==0){
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "소수입니다" : "소수 아님");

    }

}
