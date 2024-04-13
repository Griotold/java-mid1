package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 메소드로 추출되어 있으면 공유 참조 사이드 이펙트를 알아차리기 더욱 어려워진다!
        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddres) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddres);
        address.setValue(changeAddres);
    }
}
