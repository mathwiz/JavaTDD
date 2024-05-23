package littlejava;

import static littlejava.Helpers.*;

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


    public static void main(String[] args) {
        KebabD it = new Radish(new Shallot(new Shrimp(new Holder(52))));
        println(it);
        printf("whatHolder: %s\n", it.whatHolder());
    }

}
