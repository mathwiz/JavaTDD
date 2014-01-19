package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public abstract class ShishD {
    abstract boolean onlyOnions();

    ShishD s;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                s +
                '}';
    }

    public static void main(String[] args) {
        ShishD onion = new Onion(new Lamb(new Onion(new Skewer())));
        System.out.println(onion);
        System.out.println(onion.onlyOnions());
        onion = new Onion(new Onion(new Onion(new Skewer())));
        System.out.println(onion);
        System.out.println(onion.onlyOnions());
        onion = new Onion(new Skewer());
        System.out.println(onion);
        System.out.println(onion.onlyOnions());
    }
}
