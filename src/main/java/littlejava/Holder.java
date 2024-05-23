package littlejava;

import static littlejava.Helpers.*;

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
        return "new " + this.getClass().getSimpleName() + 
            (o == null ? "()" : "(" + o + ")");
    }


    public static void main(String[] args) {
        KebabD it = new Shallot(new Radish(new Holder(new OneMoreThan(new Zero()))));
        println(it);
        printf("whatHolder: %s\n", it.whatHolder());
    }
}
