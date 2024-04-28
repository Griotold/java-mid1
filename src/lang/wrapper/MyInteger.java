package lang.wrapper;

/**
 * 직접 만든 래퍼 클래스
 * 기본형인 int 를 객체로 다루면 메서드를 추가할 수 있다.
 */
public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
