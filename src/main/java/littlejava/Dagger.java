package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/19/14.
 */
public class Dagger extends RodD {
    public static void main(String[] args) {
        KebabD kebab =
                new Shallot(
                new Radish(
                new Holder(
                new Dagger())));
        println(kebab);
        println("isVeggie() " + kebab.isVeggie());
        println("whatHolder() " + kebab.whatHolder());
    }
}
