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

    @Override
    public boolean equals(Object o) {
        if (o instanceof OneMoreThan) {
            return predecessor.equals(((OneMoreThan) o).predecessor);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new SalmonFish(),
                        new Top(new Integer(42),
                                new Top(new OneMoreThan(new Zero()),
                                        new Top(new Long(1),
                                                new Top(new Zero(),
                                                        new Top(new OneMoreThan(new OneMoreThan(new Zero())),
                                                                new Top(new Double(2.3),
                                                                        new Bot()))))))
                );
        System.out.println("Before\n" + p);
        PieD after = p.rem(new RemV(), new OneMoreThan(new Zero())).rem(new RemV(), new Zero());
        System.out.println("After\n" + after);
    }

}
