package lang.wrapper.test;

/**
 * String str` 을 `Integer` 로 변환해서 출력해라.
 * `Integer` 를 `int` 로 변환해서 출력해라.
 * `int` 를 `Integer` 로 변환해서 출력해라.
 * 오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.
 */
public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // 코드 작성
        // String -> Integer
        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        // Integer -> int
        int intValue = integer;
        System.out.println("intValue = " + intValue);

        // int -> Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}
