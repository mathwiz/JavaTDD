package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class OneMoreThan extends NumD {
    NumD predecessor;

    public OneMoreThan(NumD predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return "OneMoreThan{" +
                "predecessor=" + predecessor +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(
                new OneMoreThan(
                        new OneMoreThan(
                                new Zero()))
        );
    }
}
