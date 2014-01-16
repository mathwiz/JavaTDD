package littlejava;

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
        return "Base{" +
                "o=" + o +
                '}';
    }
}
