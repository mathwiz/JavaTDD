package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class ManhattanPt extends PointD {

    public ManhattanPt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "ManhattanPt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
