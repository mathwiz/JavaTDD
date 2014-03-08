package littlejava;

/**
 * Created by Yohan on 3/8/14.
 */
public class IsVegetarianV {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(ShishD s) {
        return s.isVegetarian();
    }

    boolean forLamb(ShishD s) {
        return false;
    }

    boolean forTomato(ShishD s) {
        return s.isVegetarian();
    }
}
