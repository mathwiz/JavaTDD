package littlejava;

/**
 * Created by Yohan on 1/15/14.
 */
public class Zero extends NumD {
    @Override
    public String toString() {
        return "Zero{}";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Zero;
    }
}
