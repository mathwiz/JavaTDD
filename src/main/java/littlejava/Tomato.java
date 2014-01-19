package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public class Tomato extends ShishD {
    public Tomato(ShishD s) {
        this.s = s;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }
}
