package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class Bot extends PieD {
    @Override
    public PieD remFish(FishD fishD) {
        return rfFn.forBot(fishD);
    }

    @Override
    public PieD remA() {
        return raFn.forBot();
    }

    @Override
    public PieD remInt(Integer i) {
        return riFn.forBot(i);
    }

    @Override
    public PieD rem(RemV rFn,Object o) {
        return rFn.forBot(o);
    }

    @Override
    public PieD subst(SubstV substFn, Object n, Object o) {
        return substFn.forBot(n, o);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Bot;
    }
}
