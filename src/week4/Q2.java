package week4;


//사용자로부터 비밀번호를 입력받고, 맞을 때까지 계속 입력받도록 하는 do-while 루프를 작성하세요.
//비밀번호 입력 전에 비밀번호 입력: 문구를 출력하고, 비밀번호가 일치할 시 접속 성공 문구를 출력하
//세요. (정답은 "asdf")

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String pw = "asdf";

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.print("비밀번호 입력: ");
            input  = sc.nextLine();
        }
        while(!input.equals(pw));
        System.out.print("접속 성공!\n");
    }

}
