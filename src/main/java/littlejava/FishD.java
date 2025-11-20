package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public abstract class FishD {

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "";
    }

    public static void main(String[] args) {
        FishD x = null;
        System.out.println(x);
    }
}
