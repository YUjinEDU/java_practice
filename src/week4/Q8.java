package week4;


//1부터 50까지 숫자를 출력하되, 숫자에 3, 6, 9가 포함되면 숫자 대신 짝을 출력하세요. 해당 숫자에 3, 6,
//9가 여러 번 포함되면 그 횟수만큼 짝, 짝짝 등으로 출력하세요

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {


    for(int i=1;i<=50;i++){

        int num = i;
        int count = 0;

        while(num >0){
            int tail = num % 10;
            if(tail == 3 || tail == 6 ||tail == 9 ){
                count++;
            }
            num = num/10;
        }

        if(count == 0){
            System.out.println(i + " ");
        }

        else{
            for(int j=0;j<count;j++){
                System.out.print("짝\n");
            }
        }

        System.out.print(" ");


    }

    }

}
