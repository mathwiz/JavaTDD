package puzzlers;

/**
 * Created by yohanlee on 10/12/14.
 */
public class IsOdd {
    static boolean isOddWrong(int i) {
        return i % 2 == 1;
    }

    static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        assert isOdd(-3);
        assert !isOddWrong(-3);
    }
}
