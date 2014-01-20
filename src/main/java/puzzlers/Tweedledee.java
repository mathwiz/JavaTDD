package puzzlers;

/**
 * Created by Yohan on 1/19/14.
 */
public class Tweedledee {
    public static void main(String[] args) {
        String i = "0";
        Object x = "0";
//        System.out.println(x += i); does not compile
        System.out.println(x = x + i);
    }
}
