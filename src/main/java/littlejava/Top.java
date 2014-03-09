package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class Top extends PieD {
    Object t;
    PieD r;

    public Top(Object t, PieD r) {
        this.t = t;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Top{" +
                "t=" + t +
                ",\nr=" + r +
                "}";
    }

    @Override
    public PieD remA() {
        return raFn.forTop(t, r);
    }
}
