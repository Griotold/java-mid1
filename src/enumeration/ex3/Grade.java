package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND
}

/**
 * 위 코드와 아래 코드는 동일하다
 * <p>
 * public class Grade extends Enum {
 * public static final Grade BASIC = new Grade();
 * public static final Grade GOLD = new Grade();
 * public static final Grade DIAMON = new Grade();
 * <p>
 * private Grade() {}
 * }
 */

/**
 * public class Grade extends Enum {
 *     public static final Grade BASIC = new Grade();
 *     public static final Grade GOLD = new Grade();
 *     public static final Grade DIAMON = new Grade();
 *
 *     private Grade() {}
 * }
 * */
