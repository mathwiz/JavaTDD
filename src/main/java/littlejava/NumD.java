package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public abstract class NumD {
    public static void main(String[] args) {
        System.out.println(
                new OneMoreThan(
                        new OneMoreThan(
                                new Zero()))
        );
    }
}
