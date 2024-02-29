package algorithms.graph;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/19/14.
 */
public class DepthFirstSearchTest extends GraphTBase {
    @Before
    public void setUp() throws Exception {
        super.setUp();
        System.out.println(getGraph());
    }

    @Test
    public void testMarked() throws Exception {
        printResults(0);
        printResults(5);
        printResults(7);
        printResults(8);
        printResults(9);
    }

    private void printResults(int source) {
        DepthFirstSearch dfs = new DepthFirstSearch(getGraph(), source);
        System.out.println("\n" + dfs.count() + " vertices connected to " + source);
        for (int i = 0; i < getGraph().V(); i++) {
            System.out.println((dfs.marked(i) ? "" : "Not ") + "Connected vertex " + i);
        }
    }
}
