package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public class QuickUF implements UFStrategy {
    private UF.State state;

    @Override
    public void setState(UF.State state) {
        this.state = state;
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public int find(int p) {
        return 0;
    }
}
