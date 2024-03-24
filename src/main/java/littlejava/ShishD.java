package littlejava;

import static littlejava.Helpers.println;

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

    public static void main(String[] args) {
        ShishD shish = new Onion(new Lamb(new Onion(new Skewer())));
        println(shish);
        println(shish.toPropertiesString());
        shish = new Onion(new Onion(new Onion(new Skewer())));
        println(shish);
        println(shish.toPropertiesString());
        shish = new Tomato(new Tomato(new Onion(new Skewer())));
        println(shish);
        println(shish.toPropertiesString());
        shish = new Onion(new Skewer());
        println(shish);
        println(shish.toPropertiesString());
    }

}
