package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";

        // 문자열을 반복문 안에서 더하는 경우 최적화가 이루어지지 않는다!
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        // 왜냐하면 대략 다음과 같이 최적화 되기 때문이다.
//        for (int i = 0; i < 100000; i++) {
//            result = new StringBuilder().append(result).append("Hello Java ").toString();
//        }

        System.out.println("result = " + result);
        // M2 맥북 프로 -> 2.5 초
        // gram -> 4.680 초
        System.out.println("time = " + (endTime - startTime));
    }
}
