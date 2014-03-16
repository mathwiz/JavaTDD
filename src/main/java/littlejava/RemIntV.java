package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class RemIntV {
    public PieD forBot(Integer i) {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r, Integer i) {
        if (i.equals(t)) {
            return r.remInt(i);
        } else {
            return new Top(t, r.remInt(i));
        }
    }
}
