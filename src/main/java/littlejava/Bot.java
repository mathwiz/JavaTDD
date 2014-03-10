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
}
