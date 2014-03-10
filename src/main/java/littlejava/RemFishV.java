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
}
