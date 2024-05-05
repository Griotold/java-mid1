package enumeration.ex2;

/**
 * 타입 안전 열겨형 패턴
 * 1. 타입 안정성 향상
 * 2. 데이터 일관성
 */
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자를 추가하여 외부에서 생성하지 못하도록 막는다.
    private ClassGrade() {
    }
}
