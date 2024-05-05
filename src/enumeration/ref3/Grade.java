package enumeration.ref3;
/**
 * 객체지향 관점에서 자신의 데이터를 외부에 노출하는 것보다는
 * 자신의 할인율을 스스로 관리하는 것이 캡슐화 원칙에 더 맞다.
 * */
public enum Grade {

    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가 : 할인율을 통한 할인된 금액을 스스로 계산한다.
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
