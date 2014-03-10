package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class SalmonFish extends FishD {
    @Override
    public boolean equals(Object o) {
        return o instanceof SalmonFish;
    }
}
