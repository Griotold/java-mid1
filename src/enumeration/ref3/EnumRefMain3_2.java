package enumeration.ref3;
/**
 * DiscountService 제거
 * 그냥 Grade.discount() 를 호출하면 된다.
 * */
public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10_000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
