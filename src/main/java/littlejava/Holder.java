package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public class Holder extends KebabD {
    Object o;

    public Holder(Object o) {
        this.o = o;
    }

    @Override
    public boolean isVeggie() {
        return true;
    }

    @Override
    public Object whatHolder() {
        return o;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "o=" + o +
                '}';
    }
}
