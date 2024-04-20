package lang.immutable.address;

/**
 * 불변 객체인 ImmutableAddress address 를 사용한다
 * address 를 바꾸는 방법은 있어야 한다 (setter 가 마음에 안들면 다른 이름의 메서드를 선언해야)
 */
public class MemberV2 {
    private final String name;

    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
