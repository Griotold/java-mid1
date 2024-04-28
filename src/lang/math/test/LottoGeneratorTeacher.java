package lang.math.test;

import java.util.Random;


/**
 * 정답지
 */
public class LottoGeneratorTeacher {
    private final Random random = new Random();
    private final int[] lottoNumbers = new int[6];
    private int count = 0;

    public int[] generate() {
        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int lottoNumber : lottoNumbers) {
            if (number == lottoNumber) return false;
        }
        return true;
    }
}
