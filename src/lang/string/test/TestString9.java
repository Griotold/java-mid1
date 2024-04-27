package lang.string.test;

/**
 * split()` 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
 */
public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        // 코드 작성
        String[] split = email.split("@");
        System.out.println("ID: " + split[0]);
        System.out.println("Domain: " + split[1]);
    }
}
