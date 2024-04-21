package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1.withYear(2025);
        ImmutableMyDate date3 = date1.withMoth(2);
        ImmutableMyDate date4 = date1.withDay(3);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
        System.out.println("date4 = " + date4);
    }
}
