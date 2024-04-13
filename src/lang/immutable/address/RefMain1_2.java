package lang.immutable.address;
/**
 * 여러 참조 변수가 하나의 객체를 공유하지 않는다면 문제가 발생하지 않는다.
 * 하지만, 하나의 객체를 여러 변수가 공유하지 않도록 강제로 막는 방법이 없다.
 * */
public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        // 새로운 객체를 대입하면 사이드 이펙트를 해결할 수 있다.
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
