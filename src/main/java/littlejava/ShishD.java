package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public abstract class ShishD {
    ShishD s;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                s +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Onion(new Lamb(new Onion(new Skewer()))));
    }
}
