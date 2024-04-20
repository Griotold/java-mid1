package lang.immutable.address;

/**
 * 사이드 이펙트 발생!
 * B의 주소만 바꿨는데 A도 같이 바뀜
 * Address 인스턴스를 공유하기 때문
 */
public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원B 의 주소를 부산으로 변경함
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
