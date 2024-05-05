package enumeration.ref1;

/**
 * 할인율은 회원 등급에 의해 결정된다.
 * 따라서, 해당 클래스가 할인율을 관리하도록 하자.
 */
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
