package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/19/14.
 */
public class Shrimp extends KebabD {

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

    public static void main(String[] args) {
        KebabD it = new Shrimp(new Holder(new Zero()));
        println(it);
        printf("isVeggie: %s\n", it.isVeggie());
        printf("whatHolder: %s\n", it.whatHolder());
    }

}
