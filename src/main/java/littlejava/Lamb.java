package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public class Lamb extends ShishD {
    public Lamb(ShishD s) {
        this.s = s;
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forLamb(this.s);
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forLamb(this.s);
    }
}
