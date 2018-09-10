package puzzlers;

/**
 * Created by Yohan on 2/23/14.
 */
public class Abc {
    public static void main(String[] args) {
        String ABC = "ABC";
        char[] onetwothree = {'1', '2', '3'};
        System.out.println(ABC + " as easy as " + onetwothree);
        System.out.println(ABC);
        System.out.println(onetwothree);
        System.out.println(ABC + " as easy as " + String.valueOf(onetwothree));
        Object numbers = onetwothree;
        System.out.println(ABC + " as easy as " + String.valueOf(numbers));
    }
}
