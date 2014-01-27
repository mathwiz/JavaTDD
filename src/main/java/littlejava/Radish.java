package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public class Radish extends KebabD {
    KebabD k;

    public Radish(KebabD k) {
        this.k = k;
    }

    @Override
    public boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    public String toString() {
        return "Radish{" +
                "k=" + k +
                '}';
    }
}
