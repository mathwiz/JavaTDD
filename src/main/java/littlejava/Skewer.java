package littlejava;

/**
 * Created by Yohan on 1/18/14.
 */
public class Skewer extends ShishD {
    @Override
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forSkewer();
    }

    @Override
    public String toString() {
        return "Skewer{}";
    }
}
