package lang.string.test;

/**
 * `replace()` 를 사용해서 `java` 라는 단어를 `jvm` 으로 변경해라.
 */
public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        // 코드 작성
        String replaced = input.replace("java", "jvm");
        System.out.println("replaced = " + replaced);

        // replaceAll() 은 정규표현식도 파라미터로 받을 수 있다.
        String replacedAll = input.replaceAll("java", "jvm");
        System.out.println("replacedAll = " + replacedAll);
    }
}
