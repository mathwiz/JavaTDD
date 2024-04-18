package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public class Radish extends KebabD {
    public Radish(KebabD k) {
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
