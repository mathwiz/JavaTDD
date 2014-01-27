package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public class Shallot extends KebabD {
    KebabD k;

    public Shallot(KebabD k) {
        this.k = k;
    }

    @Override
    public boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    public Object whatHolder() {
        return k.whatHolder();
    }

    @Override
    public String toString() {
        return "Shallot{" +
                "k=" + k +
                '}';
    }
}
