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
}
