package littlejava;

/**
 * Created by Yohan on 1/19/14.
 */
public abstract class KebabD {
    public abstract boolean isVeggie();

    public static void main(String[] args) {
        KebabD kebab = new Shallot(
                new Radish(
                        new Holder(
                                new Dagger()
                        )
                )
        );
        System.out.print(kebab);
        System.out.println(" is veggie " + kebab.isVeggie());
    }
}
