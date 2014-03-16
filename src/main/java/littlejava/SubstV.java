package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class SubstV {
    public PieD forBot(Object n, Object o) {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r, Object n, Object o) {
        if (o.equals(t)) {
            return new Top(n, r.subst(n, o));
        } else {
            return new Top(t, r.subst(n, o));
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
        PieD after = p.subst(new Character('4'), new Integer(42)).subst(new Zero(), new AnchovyFish());
        System.out.println("After\n" + after);
    }

}
