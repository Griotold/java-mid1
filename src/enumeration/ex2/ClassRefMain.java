package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        // 각각의 상수는 모두 ClassGrade 타입
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        // 각각의 상수는 모두 서로 다른 인스턴스를 참조
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
