package week3;

public class assigment {
    public static void main(String[] args) {
        //20191906 박유진

        // 1
        float score = 88.5f;
        int intscore = (int) score;
        System.out.println("Q1 score = " + score);
        System.out.println("Q1 intscore = " + intscore);

        //2
        char ch = 'B';
        System.out.println("Q2 ch = " + (int)ch);

        //3
        //a를 초기화 하지 않아서 쓰레기 값이 들어있음.

        //4
        String str = "123";
        int intstr = Integer.parseInt(str);
        System.out.println("Q4 str = " + str);

        //5
        var message = "Hello!";
        System.out.println("Q5 message = " + message);

        //6
        float value1 = 0.3f;
        double value2 = 0.3;

        System.out.printf("Q6 value1 = %.10f\n",value1);
        System.out.printf("Q6 value2 = %.10f\n" ,value2);
        // float의 유효자리수는 7자리
        // Double의 유효자리수는 15자리이기 때문에 float에서는
        // 오차가 섞여있다.


        //7
        float value3 = 123.456f;
        System.out.printf("Q7 value3 = %010.4f\n",value3);

        //8
        byte a  = 127;
        a++;
        System.out.println("Q8 a = " + a);
        // 오버플로우로 byte의 최솟값인 -128로 넘어간다.

        //9
        byte b  = -128;
        b--;
        System.out.println("Q9 b = " + b);
        // 언더플로우로 byte의 최대값인 127로 넘어간다.

        //10
        int total = 10;
        int count = 4;
        float avg = (float)total/count;
        System.out.println("Q10 avg = " + avg);

        //11
        double num = 10.0/0.0;
        System.out.println("Q11 num = " + num);
        // 0으로 나눴으니 => Infinity

        //12
        boolean isLogin = false;
        boolean isAdmin = true;
        System.out.printf("Q12 AND = %b\n" ,(isLogin && isAdmin));
        System.out.printf("Q12 OR = %b\n", (isLogin || isAdmin));
        // AND 일때는 false인 isLogin가 존재해서 => false
        // OR 일때는 1개라도 true인 isAdmin가 존재해서 => true

        //13
        int a2 =5;
        int b2 = 3;
        System.out.printf("Q13 AND = %d\n",(a2&b2));
        System.out.printf("Q13 OR = %d\n",(a2|b2));
        System.out.printf("Q13 XOR = %d\n",(a2^b2));
        // a & b: 0101 & 0011 => 0001 => 2
        // a | b: 0101 | 0011 => 0111 => 7
        // a ^ b: 0101 ^ 0011 => 0110 => 6

        //14
        int num2 = -8;
        int res = num2 >> 2;
        int res2 = num2 >>> 2;
        System.out.printf("Q14 >> 2 = %d\n",(res));
        System.out.printf("Q14 >>> 2 = %d\n",(res2));
        // >>2의 경우 "1111000"에서 00을 버리고 앞쪽 비트에 최상위 비트와 같은 11이
        // 추가되서서 계속 음수가 됩니다. 따라서 "1111110" 으로 -2가 됩니다.
        // >>>2의 경우 "1111000"에서 00을 버리고 앞쪽 비트에 00이 추가되어서
        // 음수가 아니게 됩니다. 그래서 큰 양수가 됩니다.


        //15
        int x = 10;  // 10
        int result1 = x++ +2 *3; // 16 =  10 + 2 * 3
        // x는 result1 계산 후 11로 증가됨
        int result2 = ++x +2 *3; // 18 =  12 + 2 * 3
        // x는 11 +1 = 12로 계산됨
        int result3 = (x++ +2) *3;// 42 = (12 + 2) * 3
        // x는 result3 계산 후 13로 증가됨
        int result4 = (++x +2) *3;// 48 = (14 + 2) * 3
        // x는 13 +1 = 14로 계산됨

    }

}
