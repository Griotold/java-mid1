package lang.object.tostring;
/**
 * 말 그대로 나쁜 코드
 * 구체적인 것에 의존하고 있다.
 * */
public class BadObjectPrinter {
    // Car 전용 프린터
    public static void print(Car car) {
        String string = "객체 정보 출력 :" + car.toString();
        System.out.println(string);
    }

    public static void print(Dog dog) {
        String string = "객체 정보 출력 :" + dog.toString();
        System.out.println(string);
    }
}
