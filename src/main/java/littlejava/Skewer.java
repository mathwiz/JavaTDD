package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/18/14.
 */
public class Skewer extends ShishD {
    @Override
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forSkewer();
    }

    public static void main(String[] args) {
        ShishD shish = new Skewer();
        printf("onlyOnions() for %s is: %s\n", shish, shish.onlyOnions());
    }

}
