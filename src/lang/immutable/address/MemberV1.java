package lang.immutable.address;

/**
 * 해당 클래스는 변경 가능한 Address 클래스를 사용한다.
 */
public class MemberV1 {
    private final String name;

    private Address address;

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
