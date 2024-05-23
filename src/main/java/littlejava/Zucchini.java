package littlejava;

import static littlejava.Helpers.*;

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

    public static void main(String[] args) {
        KebabD it = new Zucchini(new Holder(52));
        println(it);
        printf("isVeggie: %s\n", it.isVeggie());
        printf("whatHolder: %s\n", it.whatHolder());
    }

}
