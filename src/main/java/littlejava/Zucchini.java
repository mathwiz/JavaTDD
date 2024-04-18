package littlejava;

/**
 * Created by Yohan on 1/26/14.
 */
public class Zucchini extends KebabD {
    public Zucchini(KebabD k) {
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

}
