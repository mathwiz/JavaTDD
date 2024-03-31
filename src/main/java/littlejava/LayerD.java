package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/15/14.
 */
public abstract class LayerD {
    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }

    public static void main(String[] args) {
        LayerD it =  new Base(new Zero());
        println(it);
    }
}
