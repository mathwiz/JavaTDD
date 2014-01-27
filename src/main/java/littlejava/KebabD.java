package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public abstract class KebabD {
    public static void main(String[] args) {
        System.out.println(new Shallot(
                new Radish(
                        new Holder(
                                new Dagger()
                        )
                )
        ));
    }
}
