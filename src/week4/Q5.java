package week4;


//정수 stage를 입력받아 그 숫자와 동일한 높이의 삼각형 패턴을 출력합니다. 삼각형 패턴은 아래와 같이
//별(*) 과 대시 (-)로 구성됩니다. (int stage = 4 처럼 임의로 stage 초기화

public class Q5 {
    public static void main(String[] args) {
        int stage = 4;

        for(int i=1; i<=stage; i++){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }

           for(int k=stage-i; k>0; k--){
               System.out.print("_");
           }

           System.out.println();
        }

        for(int i=1; i<=stage; i++){
            for(int j=stage-i; j>0; j--){
                System.out.print("*");
            }

            for(int k=1; k<=i; k++){
                System.out.print("_");
            }

            System.out.println();
        }


    }

}
