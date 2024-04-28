package lang.wrapper;

/**
 * -1을 찾아도 -1을 리턴하고 없는 값이어도 -1을 리턴하니
 * 구분할 수 가 없다.
 * 데이터가 "없음"을 나타낼 수 있어야 한다.
 */
public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // -1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
