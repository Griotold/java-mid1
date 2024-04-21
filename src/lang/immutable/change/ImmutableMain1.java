package lang.immutable.change;

/**
 * 불변 객체의 값 변경
 * 불변 객체에서 변경은 꼭! 리턴 값을 받아야 한다!
 */
public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);

        // 불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 리턴하기 때문에
        // 꼭! 리턴 값을 받아야 한다.
        ImmutableObj obj2 = obj1.add(20);

        // 계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
