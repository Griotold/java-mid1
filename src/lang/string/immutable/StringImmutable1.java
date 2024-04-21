package lang.string.immutable;

/**
 * String 은 불변객체라서 변경이 필요한 경우
 * 새로운 결과를 만들어서 리턴한다.
 */
public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);

        // 변경후 리턴된 걸 받아서 사용해야 한다!
        String str2 = str.concat(" world");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
