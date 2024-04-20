package lang.immutable.address;

/**
 * 불변 객체 도입
 * 멤버 변수를 final 로 선언
 * setter 는 제거
 */
public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
