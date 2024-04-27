package lang.string.test;

/**
 * split()` 를 사용해서 `fruits` 를 분리하고, `join()` 을 사용해서 분리한 문자들을 하나로 합쳐라.
 * 실행 결과를 참고해라.
 */
public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성
        String[] split = fruits.split(",");
        String joined = String.join("->", split);

        for (String str : split) {
            System.out.println(str);
        }
        System.out.println("joined = " + joined);
    }
}
