package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/15/14.
 */
public class ManhattanPt extends PointD {

    public static final ManhattanPt ORIGIN = new ManhattanPt(0, 0);

    public ManhattanPt(int x, int y) {
        super(x, y);
    }

    @Override
    public int distanceToO() {
        return distanceTo(ORIGIN);
    }

    @Override
    public int distanceTo(PointD point) {
        return Math.abs(x-point.x) + Math.abs(y-point.y);
    }

    public static void main(String[] args) {
        ManhattanPt a = new ManhattanPt(3,4);
        ManhattanPt b = new ManhattanPt(1,5);

        printf("Distance from %s to %s: %s\n", a, ManhattanPt.ORIGIN, a.distanceTo(ManhattanPt.ORIGIN));
        printf("Distance from %s to %s: %s\n", b, ManhattanPt.ORIGIN, b.distanceTo(ManhattanPt.ORIGIN));
        printf("%s is closer to origin than %s: %s\n", a, b, a.closerToO(b));
        printf("%s is closer to origin than %s: %s\n", b, a, b.closerToO(a));
    }
}
