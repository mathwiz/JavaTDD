package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/15/14.
 */
public class Base extends LayerD {
    Object o;

    public Base(Object o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() +
                (o == null ? "()" : "(" + o + ")");
    }

    public static void main(String[] args) {
        println("LayerD");
        LayerD it =  new Base(new Zero());
        println(it);
        it = new Base(new Salt());
        println(it);
        it = new Base(5);
        println(it);
        it = new Base(false);
        println(it);
    }

}
