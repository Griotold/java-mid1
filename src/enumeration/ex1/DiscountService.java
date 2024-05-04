package enumeration.ex1;

/**
 * 상수를 사용한 예제
 * 곧장 문자열을 사용하는 것보다 낫긴하지만
 * 근본적인 문제 해결은 아니다.
 */
public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPercent / 100;
    }
}
