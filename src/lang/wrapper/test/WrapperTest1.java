package lang.wrapper.test;

/**
 * 문자로 입력된 str1, str2 두 수의 합을 구하자
 */
public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 코드 작성
        int str1ToInt = Integer.parseInt(str1);
        int str2ToInt = Integer.parseInt(str2);

        System.out.println("두 수의 합: " + (str1ToInt + str2ToInt));
    }
}
