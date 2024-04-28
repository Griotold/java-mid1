package lang.wrapper.test;

/**
 * String str` 을 `Integer` 로 변환해서 출력해라.
 * `Integer` 를 `int` 로 변환해서 출력해라.
 * `int` 를 `Integer` 로 변환해서 출력해라.
 * 오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.
 */
public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // 코드 작성
        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        int intValue = integer.intValue();
        System.out.println("intValue = " + intValue);

        Integer toInteger = Integer.valueOf(intValue);
        System.out.println("toInteger = " + toInteger);
    }

}
