package lang.object.equals;

import java.util.Objects;

/**
 * equals() 오버라이드
 */
public class UserV2 {
    private final String id;

    public UserV2(String id) {
        this.id = id;
    }

    // 간단 버전
//    @Override
//    public boolean equals(Object object) {
//        UserV2 user = (UserV2) object;
//        return this.id.equals(user.id);
//    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

}
