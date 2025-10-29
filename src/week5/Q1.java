package week5;

public class Q1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // equals 은 문자를 직접 비교하는 것
        // == 은 String 객체의 주소를 비교하는것 이라서
        // 서로 다른 객체 주소를 비교하므로  false이다
    }
}
