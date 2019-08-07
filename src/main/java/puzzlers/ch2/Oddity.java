package puzzlers.ch2;

public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(isOdd(Integer.MAX_VALUE));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(isOdd(Integer.MIN_VALUE));
    }
}
