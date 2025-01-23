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
        return "new " + this.getClass().getSimpleName() +
               String.format("(%s, %s)", t, r);
    }

    @Override
    public PieD remA() {
        return raFn.forTop(t, r);
    }

    @Override
    public PieD remFish(FishD fishD) {
        return rfFn.forTop(t, r, fishD);
    }

    @Override
    public PieD rem(RemV rFn, Object o) {
        return rFn.forTop(t, r, o);
    }

    @Override
    public PieD remInt(Integer i) {
        return riFn.forTop(t, r, i);
    }

    @Override
    public PieD subst(SubstV substFn, Object n, Object o) {
        return substFn.forTop(t, r, n, o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Top top = (Top) o;

        if (r != null ? !r.equals(top.r) : top.r != null) return false;
        if (t != null ? !t.equals(top.t) : top.t != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = t != null ? t.hashCode() : 0;
        result = 31 * result + (r != null ? r.hashCode() : 0);
        return result;
    }


    public static void main(String[] args) {
        PieD p = new Top(new TunaFish(),
                         new Top(42,
                                 new Top(new AnchovyFish(),
                                         new Top(5, new Bot()))))
            ;
        System.out.println(p);
    }

}
