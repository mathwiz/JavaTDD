package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/19/14.
 */
public abstract class KebabD {
    protected KebabD k;

    public abstract boolean isVeggie();

    public abstract Object whatHolder();

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + 
            (k == null ? "()" : "(" + k + ")");
    }

    public static void main(String[] args) {
        KebabD kebab =
                new Zucchini(
                new ChiliPepper(
                new Shallot(
                new Radish(
                new Holder(
                new Dagger())))));
        println(kebab);
        println("isVeggie() " + kebab.isVeggie());
        println("whatHolder() " + kebab.whatHolder());
    }
}
