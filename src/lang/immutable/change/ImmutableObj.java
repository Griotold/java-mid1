package lang.immutable.change;

/**
 * 불변 객체는 기존 값을 변경하지 않고
 * 계산 결과를 바탕으로 새로운 객체를
 * 만들어서 리턴한다.
 */
public class ImmutableObj {
    private final int value;


    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;

        // 계산 결과를 바탕으로 새로운 객체를 만들어서 리턴
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
