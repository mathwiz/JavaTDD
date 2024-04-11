package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/18/14.
 */
public class Tomato extends ShishD {
    public Tomato(ShishD s) {
        this.s = s;
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forTomato(this.s);
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forTomato(this.s);
    }

    public static void main(String[] args) {
        ShishD shish = new Tomato(new Onion(new Tomato(new Skewer())));
        printf("onlyOnions() for %s is: %s\n", shish, shish.onlyOnions());
        printf("isVegatarian() for %s is: %s\n", shish, shish.isVegetarian());
    }
}
