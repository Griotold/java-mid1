package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-001");
        UserV1 user2 = new UserV1("id-001");

        // 1. 동일성(identity) 비교
        System.out.println("동일성 비교 : " + (user1 == user2)); // false

        // 2. 동등성(equality) 비교
        // -> Object.equals() 는 기본적으로 == 을 제공한다.
        System.out.println("동등성 비교 : " + (user1.equals(user2))); // false

    }
}
