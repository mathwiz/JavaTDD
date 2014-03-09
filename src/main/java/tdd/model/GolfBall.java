package tdd.model;

/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 1/1/14
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class GolfBall implements Equipment {
    private int compression;
    private String brand;
    private String model;

    public GolfBall(String brand, String model, int compression) {
        this.compression = compression;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GolfBall)) return false;

        GolfBall golfBall = (GolfBall) o;

        if (compression != golfBall.compression) return false;
        if (brand != null ? !brand.equals(golfBall.brand) : golfBall.brand != null) return false;
        if (model != null ? !model.equals(golfBall.model) : golfBall.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = compression;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    public int getCompression() {

        return compression;
    }

    public void setCompression(int compression) {
        this.compression = compression;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
