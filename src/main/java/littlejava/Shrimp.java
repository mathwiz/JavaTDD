package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public class Shrimp extends KebabD {
    KebabD k;

    public Shrimp(KebabD k) {
        this.k = k;
    }

    @Override
    public boolean isVeggie() {
        return false;
    }

    @Override
    public Object whatHolder() {
        return k.whatHolder();
    }

    @Override
    public String toString() {
        return "Shrimp{" +
                "k=" + k +
                '}';
    }
}
