package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class RemAnchovyV {

    public PieD forBot() {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r) {
        if (new AnchovyFish().equals(t)) {
            return r.remA();
        } else {
            return new Top(t, r.remA());
        }
    }
}
