package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class CartesianPt extends PointD {

    public static final CartesianPt ORIGIN = new CartesianPt(0, 0);

    public CartesianPt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "CartesianPt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int distanceToO() {
        return distanceTo(ORIGIN);
    }

    @Override
    public int distanceTo(PointD point) {
        return (int)Math.sqrt(x*point.x + y*point.y);
    }
}
