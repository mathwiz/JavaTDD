package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class Zero extends NumD {
    @Override
    public String toString() {
        return "Zero{}";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Zero;
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new SalmonFish(),
                        new Top(new Integer(42),
                                new Top(new Zero(),
                                        new Top(new Long(1),
                                                new Top(new Zero(),
                                                        new Top(new Zero(),
                                                                new Top(new Double(2.3),
                                                                        new Bot()))))))
                );
        System.out.println("Before\n" + p);
        PieD after = p.rem(new Zero()).rem(new Double(2.3)).rem(new Integer(42)).rem(new SalmonFish());
        System.out.println("After\n" + after);
    }
}
