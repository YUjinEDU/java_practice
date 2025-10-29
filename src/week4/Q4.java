package week4;


// 4. 1부터 30까지의 숫자 중에서 3의 배수와 5의 배수는 건너뛰고 출력하되, 출력된 숫자의 합계가 50을 초
//과하면 출력을 멈추도록 하세요. (continue 와 break 사용

public class Q4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=30; i++){

            if(i%3==0 || i%5==0){
//                System.out.printf("%d = 3 또는 5의 배수\n", i);
                continue;
            }
            System.out.println(i);

            System.out.printf("sum = %d\n",sum);
            if(sum > 50) break;
            sum += i;

        }
    }

}
