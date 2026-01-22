package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class SalmonFish extends FishD {
    @Override
    public boolean equals(Object o) {
        return o instanceof SalmonFish;
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new AnchovyFish(),
                        new Top(42,
                                new Top(new AnchovyFish(),
                                        new Top(new TunaFish(),
                                                new Top(new AnchovyFish(),
                                                        new Top(2.3,
                                                                new Bot())))))
                ).subst(new SubstV(), new SalmonFish(), new AnchovyFish());
        System.out.println(p);
    }


}
