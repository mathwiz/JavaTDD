package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public class Tomato extends ShishD {
    public Tomato(ShishD s) {
        this.s = s;
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }

    @Override
    boolean onlyOnions() {
        return false;
    }
}
