package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public abstract class AbstractUFStrategy implements UFStrategy {
    protected UF.State state;

    @Override
    public void setState(UF.State state) {
        this.state = state;
    }
}
