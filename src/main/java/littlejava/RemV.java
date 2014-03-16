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
}
