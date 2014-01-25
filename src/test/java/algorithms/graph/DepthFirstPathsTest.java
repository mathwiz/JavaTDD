package algorithms.graph;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/25/14.
 */
public class DepthFirstPathsTest extends GraphTest {
    int source;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        source = 0;
        System.out.println(getGraph());
    }

    @Test
    public void testHasPathTo() throws Exception {
        Graph g = getGraph();
        Paths search = new DepthFirstPaths(g, source);
        for(int v = 0; v < getGraph().V(); v++) {
            System.out.println("\n" + source + " to " + v + ": ");
            if (search.hasPathTo(v)) {
                for (int x : search.pathTo(v)) {
                    if (x == source) System.out.print(x);
                    else System.out.print("-" + x);
                }
            }
            System.out.println();
        }
    }
}
