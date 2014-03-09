package tdd.model;

/**
 * Created by Yohan on 3/9/14.
 */
public class GolfClub implements Equipment {
    private String model;
    private String brand;
    private ClubNumber number;

    public GolfClub(String brand, String model, ClubNumber number) {
        this.model = model;
        this.brand = brand;
        this.number = number;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    public ClubNumber getNumber() {
        return number;
    }
}
