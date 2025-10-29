package week4;


//사용자로부터 양의 정수 num을 입력받고, n이 소수인지 아닌지 판단하는 코드를 작성하세요. 소수이면
//소수입니다, 소수가 아니면 소수가 아닙니다를 출력하세요.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        System.out.print("숫자 입력:  ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int orig = num;
        boolean rev =  false;
        int rev_tail = 0;
        while(num != 0){
            int tail = num %10;
            rev_tail = rev_tail *10 + tail;
            num = num/10;
        }

        if(orig == rev_tail){
            rev = true;
        }
        System.out.println(rev ? "회문입니다" : "회문 아님");

    }

}
