package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class CartesianPt extends PointD {

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
}
