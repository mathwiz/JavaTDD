package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 3/8/14.
 */
public class OnlyOnionsV {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(ShishD s) {
        return s.onlyOnions();
    }

    boolean forLamb(ShishD s) {
        return false;
    }

    boolean forTomato(ShishD s) {
        return false;
    }

    public static void main(String[] args) {
        ShishD shish = new Onion(new Lamb(new Skewer()));
        printf("onlyOnions() for %s is: %s\n", shish, shish.onlyOnions());
    }
}
