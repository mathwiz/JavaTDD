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
        return false;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }
}
