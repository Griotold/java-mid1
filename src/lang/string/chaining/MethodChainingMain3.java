package lang.string.chaining;

/**
 * 메서드 체이닝 도입
 */
public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
