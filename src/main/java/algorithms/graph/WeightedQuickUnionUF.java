package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public class WeightedQuickUnionUF extends QuickUnionUF {
    @Override
    public UF.State createState(int n) {
        return this.state = new UF.WeightedState(n);
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        //put p and q into same component by making p's link go to qId
        //by always linking smaller tree to larger tree
        UF.WeightedState ws = (UF.WeightedState) state;
        int[] sz = ws.getSize();
        int[] id = ws.getId();
        if (sz[i] < sz[j]) {
            id[i] = j; sz[j] += sz[i];
        } else {
            id[j] = i; sz[i] += sz[j];
        }

        ws.decrement();
    }

}
