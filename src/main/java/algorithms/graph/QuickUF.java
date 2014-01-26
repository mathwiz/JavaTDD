package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public class QuickUF extends AbstractUFStrategy {

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;

        //put p and q into same component by replacing p's with qId
        for (int i = 0; i < state.getId().length; i++)
            if (state.getId()[i] == pId) state.getId()[i] = qId;
        state.decrement();
    }

    @Override
    public int find(int p) {
        return state.getId()[p];
    }
}
