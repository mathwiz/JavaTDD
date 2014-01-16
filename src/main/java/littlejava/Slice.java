package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class Slice extends LayerD {
    LayerD l;

    public Slice(LayerD l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Slice{" +
                "l=" + l +
                '}';
    }
}
