package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public abstract class PointD {
    int x;
    int y;

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
        return "PointD{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        PointD pt1 = new CartesianPt(3,4);
        System.out.println(pt1 + " distance to origin " + pt1.distanceToO());
        PointD pt2 = new CartesianPt(5,5);
        System.out.println(pt2 + " distance to origin " + pt2.distanceToO());
        System.out.println(pt1 + " is closer to origin than " + pt2 + " : " + pt1.closerToO(pt2));
        ManhattanPt pt3 = new ManhattanPt(3, 4);
        System.out.println(pt3 + " distance to origin " + pt3.distanceToO());
        System.out.println(pt3 + " is closer to origin than " + pt1 + " : " + pt3.closerToO(pt1));
    }
}
