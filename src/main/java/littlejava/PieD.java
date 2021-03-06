package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public abstract class PieD {
    protected RemAnchovyV raFn = new RemAnchovyV();

    protected RemFishV rfFn = new RemFishV();

    protected RemIntV riFn = new RemIntV();

    @Deprecated
    public abstract PieD remA();

    @Deprecated
    public abstract PieD remFish(FishD fishD);

    @Deprecated
    public abstract PieD remInt(Integer i);

    public abstract PieD rem(RemV remV, Object o);

    public abstract PieD subst(SubstV substV,Object n, Object o);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "";
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
        System.out.println(p);
    }
}
