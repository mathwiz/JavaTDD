package algorithms.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yohanlee on 1/18/14.
 */
public abstract class GraphTBase {
    private Graph g;

    @Before
    public void setUp() throws Exception {
        g = new Graph(13);
        g.addEdge(0,5);
        g.addEdge(4,3);
        g.addEdge(0,1);
        g.addEdge(9,12);
        g.addEdge(6,4);
        g.addEdge(5,4);
        g.addEdge(0,2);
        g.addEdge(11,12);
        g.addEdge(9,10);
        g.addEdge(0,6);
        g.addEdge(7,8);
        g.addEdge(9,11);
        g.addEdge(5,3);
    }

    public Graph getGraph() {
        return g;
    }
}
