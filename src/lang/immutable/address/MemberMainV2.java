package lang.immutable.address;

/**
 * 불변 객체 ImmutableAddress 를 사용하기 때문에
 * 사이드 이펙트가 발생할 여지를 원천 차단한다.
 */
public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원B 의 주소를 부산으로 변경해야 함
        // memberB.getAddress().setValue("부산"); // 컴파일 에러
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
