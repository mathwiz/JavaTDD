package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class RemV {
    public PieD forBot(Object o) {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r, Object o) {
        if (o.equals(t)) {
            return r.rem(o);
        } else {
            return new Top(t, r.rem(o));
        }
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new SalmonFish(),
                        new Top(new Integer(42),
                                new Top(new AnchovyFish(),
                                        new Top(new Long(1),
                                                new Top(new TunaFish(),
                                                        new Top(new AnchovyFish(),
                                                                new Top(new Double(2.3),
                                                                        new Bot()))))))
                );
        System.out.println("Before\n" + p);
        PieD after = p.rem(new SalmonFish());
//        after = after.rem(new Integer(42));
        System.out.println("After\n" + after);
    }

}
