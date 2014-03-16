package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class RemFishV {
    public PieD forBot(FishD fishD) {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r, FishD fishD) {
        if (fishD.equals(t)) {
            return r.remFish(fishD);
        } else {
            return new Top(t, r.remFish(fishD));
        }
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new SalmonFish(),
                        new Top(new AnchovyFish(),
                                new Top(new TunaFish(),
                                        new Top(new AnchovyFish(),
                                                new Bot())))
                );
        System.out.println("Before\n" + p);
        PieD after = p.remFish(new AnchovyFish());
        System.out.println("After\n" + after);
    }

}
