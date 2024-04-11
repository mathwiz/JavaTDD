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
        printf("onlyOnions() is: %s\n", new Onion(new Onion(new Skewer())).onlyOnions());
    }
}
