package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/15/14.
 */
public abstract class PointD {
    int x;
    int y;

    protected PointD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public abstract int distanceToO();

    public abstract int distanceTo(PointD point);

    public final boolean closerToO(PointD pointD) {
        return this.distanceToO() <= pointD.distanceToO();
    }

    @Override
    public String toString() {
        return "new " +  this.getClass().getSimpleName() +
            "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        PointD pt1 = new CartesianPt(3,4);
        println(pt1 + ", distance to origin " + pt1.distanceToO());
        PointD pt2 = new CartesianPt(5,5);
        println(pt2 + ", distance to origin " + pt2.distanceToO());
        println(pt1 + ", is closer to origin than " + pt2 + " : " + pt1.closerToO(pt2));
        ManhattanPt pt3 = new ManhattanPt(3, 4);
        println(pt3 + ", distance to origin " + pt3.distanceToO());
        println(pt3 + ", is closer to origin than " + pt1 + " : " + pt3.closerToO(pt1));
    }
}
