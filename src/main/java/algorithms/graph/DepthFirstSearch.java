package algorithms.graph;

/**
 * Created by Yohan on 1/19/14.
 */
public class DepthFirstSearch implements Search {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph g, int source) {
        marked = new boolean[g.V()];
        dfs(g, source);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        count++;
        for(Integer i : g.adj(v))
            if (!marked[i]) dfs(g, i);
    }

    @Override
    public boolean marked(int v) {
        return marked[v];
    }

    @Override
    public int count() {
        return count;
    }
}
