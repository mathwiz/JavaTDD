package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/18/14.
 */
public class Lamb extends ShishD {
    public Lamb(ShishD s) {
        this.s = s;
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forLamb(this.s);
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forLamb(this.s);
    }

    public static void main(String[] args) {
        ShishD shish = new Lamb(new Skewer());
        printf("onlyOnions() for %s is: %s\n", shish, shish.onlyOnions());
    }
}
