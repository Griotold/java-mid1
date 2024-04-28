package lang.wrapper.test;

/**
 * 배열에 입력된 모든 숫자의 합을 구하자.
 * 숫자는 double 형이 입력될 수 있다.
 */
public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        // 코드 작성
        double result = 0.0;
        for (String str : array) {
            double parsed = Double.parseDouble(str);
            result += parsed;
        }
        System.out.println("result = " + result);
    }
}
