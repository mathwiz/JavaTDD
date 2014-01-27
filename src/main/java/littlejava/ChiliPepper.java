package littlejava;

/**
 * Created by Yohan on 1/26/14.
 */
public class ChiliPepper extends KebabD {
    KebabD k;

    public ChiliPepper(KebabD k) {
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
        return "ChiliPepper{" +
                "k=" + k +
                '}';
    }
}
