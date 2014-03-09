package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public abstract class PieD {
    protected RemAnchovyV raFn = new RemAnchovyV();

    public abstract PieD remA();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "";
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new SalmonFish(),
                        new Top(new AnchovyFish(),
                                new Top(new TunaFish(),
                                        new Top(new AnchovyFish(),
                                                new Bot())))
                );
        System.out.println(p);
    }
}
