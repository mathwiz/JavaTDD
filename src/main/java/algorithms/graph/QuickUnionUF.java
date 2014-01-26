package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public class QuickUnionUF extends AbstractUFStrategy {
    @Override
    public UF.State createState(int n) {
        return this.state = new UF.State(n);
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;

        //put p and q into same component by making p's link go to qId
        state.getId()[pId] = qId;
        state.decrement();
    }

    @Override
    public int find(int p) {
        int id = p;
        while (id != state.getId()[id])
            id = state.getId()[id];
        return id;
    }
}
