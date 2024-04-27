package lang.string.chaining;

/**
 * 중간 단계 : this 리턴 받기
 */
public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);
        int result = adder3.getValue();
        System.out.println("result = " + result);

        // 모든 참조 변수는 하나의 주소값을 가리키고 있다.
        System.out.println("adder = " + adder);
        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);
    }
}
