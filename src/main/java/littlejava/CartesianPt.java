package littlejava;

import static littlejava.Helpers.*;

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
        return (int)Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public static void main(String[] args) {
        PointD pt1 = new CartesianPt(3,4);
        println(pt1 + ", distance to origin " + pt1.distanceToO());
        PointD pt2 = new CartesianPt(12,5);
        println(pt2 + ", distance to origin " + pt2.distanceToO());
        printf("%s is closer to origin than %s: %s", pt1, pt2, pt1.closerToO(pt2));
    }

}
