package lang.immutable.address;

/**
 * 불변 객체를 사용하면 인스턴스의 값을 변경할 수 있는 방법이 없다.
 * 따라서, 사이드 이펙트가 발생하지 않는다.
 */
public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산); // 컴파일 에러 발생
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
