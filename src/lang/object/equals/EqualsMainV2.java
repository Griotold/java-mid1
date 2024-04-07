package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-001");
        UserV2 user2 = new UserV2("id-001");

        // 1. 동일성(identity) 비교
        System.out.println("identity = " + (user1 == user2));

        // 2. 동등성(equality) 비교
        System.out.println("equality = " + user1.equals(user2));
    }
}
