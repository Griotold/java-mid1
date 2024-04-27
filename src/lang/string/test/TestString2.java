package lang.string.test;

/**
 * `length()` 를 사용해서 `arr` 배열에 들어있는 모든 문자열의 길이 합을 구해라.
 */
public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        // 코드 작성
        int sum = 0;
        for (String str : arr) {
            sum += str.length();
            System.out.println(str + ":" + str.length());
        }
        System.out.println("sum = " + sum);

    }
}
