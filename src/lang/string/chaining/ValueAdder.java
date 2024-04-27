package lang.string.chaining;

/**
 * 메서드 체이닝 예제
 */
public class ValueAdder {
    private int value;

    // 자기 자신(this)를 반환
    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
