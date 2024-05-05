package enumeration.ref3;

public class DiscountService {

    // Grade.discount() 를 단순히 호출하기만 하면 된다.
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
