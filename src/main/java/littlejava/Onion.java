package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public class Onion extends ShishD {

    public Onion(ShishD s) {
        this.s = s;
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forOnion(this.s);
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forOnion(this.s);
    }
}
