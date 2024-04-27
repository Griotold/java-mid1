package lang.string.builder;

/**
 * StringBuilder 는 가변 객체
 */
public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(3, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        // StringBuilder -> String
        // StringBuilder 는 문자열을 변경하는 동안만 사용하다가
        // 마지막에 안전한(불변) String 으로 변환하는 것이 좋다.
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
