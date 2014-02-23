package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class ManhattanPt extends PointD {

    public static final ManhattanPt ORIGIN = new ManhattanPt(0, 0);

    public ManhattanPt(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "ManhattanPt{" +
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
        return Math.abs(x-point.x) + Math.abs(y-point.y);
    }
}
