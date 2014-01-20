package puzzlers;

/**
 * Created by Yohan on 1/19/14.
 */
public class Tweedledum {
    public static void main(String[] args) {
        short x = 0;
        int i = 123456;
        System.out.println(x += i);
//        System.out.println(x = x + i); does not compile
//        System.out.println(x = x + 0); does not compile
//        System.out.println(x = x + x); does not compile
//        System.out.println(x = Short.MAX_VALUE + Short.MAX_VALUE); does not compile
        System.out.println(x = 20000 + 12111);
    }
}
