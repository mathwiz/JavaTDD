package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class CartesianPt extends PointD {

    public static final CartesianPt ORIGIN = new CartesianPt(0, 0);

    public CartesianPt(int x, int y) {
        super(x, y);
    }

    @Override
    public int distanceToO() {
        return distanceTo(ORIGIN);
    }

    @Override
    public int distanceTo(PointD point) {
        return (int)Math.sqrt(Math.pow(x-point.x, 2) + Math.pow(y-point.y, 2));
    }
}
