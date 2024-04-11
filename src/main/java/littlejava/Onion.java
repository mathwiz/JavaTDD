package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/18/14.
 */
public class Onion extends ShishD {

    public Onion(ShishD s) {
        this.s = s;
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forOnion(this.s);
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forOnion(this.s);
    }

    public static void main(String[] args) {
        ShishD shish = new Onion(new Onion(new Skewer()));
        printf("onlyOnions() for %s is: %s\n", shish, shish.onlyOnions());
    }
}
