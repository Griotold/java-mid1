package enumeration.ex2;

public class ClassGradeEX2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        // private 생성자 막았기 때문에 외부에서는 인스턴스를 생성할 수 없다.
        /*ClassGrade newClassGrade = new ClassGrade(); //생성자 private으로 막아야 함
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);*/
    }
}
