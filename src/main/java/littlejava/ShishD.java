package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/18/14.
 */
public abstract class ShishD {
    abstract boolean onlyOnions();

    abstract boolean isVegetarian();

    OnlyOnionsV ooFn = new OnlyOnionsV();
    IsVegetarianV ivFn = new IsVegetarianV();

    ShishD s;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + 
            (s == null ? "()" : "(" + s + ")");
    }

    public String toPropertiesString() {
        return String.format("onlyOnions: %s, isVegetarian: %s", onlyOnions(), isVegetarian());
    }

    public static void showIt(ShishD shish) {
        print(shish);
        println(" is " + shish.toPropertiesString());
    }

    public static void main(String[] args) {
        showIt( new Onion(new Lamb(new Onion(new Skewer()))) );
        showIt( new Onion(new Onion(new Onion(new Skewer()))) );
        showIt( new Tomato(new Tomato(new Onion(new Skewer()))) );
        showIt( new Onion(new Skewer()) );
    }

}
