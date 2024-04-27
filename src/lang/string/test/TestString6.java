package lang.string.test;

/**
 * str` 에서 `key` 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
 * `indexOf()` 를 반복문과 함께 풀면 된다.
 */
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성
        int count = 0;
        int fromIndex = 0;

        while (true) {
            if (str.indexOf(key, fromIndex) > -1) {
                fromIndex = str.indexOf(key, fromIndex) + 1;
                count++;
            } else break;
        }
        System.out.println("count = " + count);
    }

    // 다른 풀이
    public static int getCount(String str, String key) {
        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }

        return count;
    }
}
