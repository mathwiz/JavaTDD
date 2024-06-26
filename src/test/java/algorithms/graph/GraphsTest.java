package algorithms.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yohanlee on 1/18/14.
 */
public class GraphsTest extends GraphTBase {

    @Test
    public void testGetSizes() throws Exception {
        System.out.println("Examining Graph: ");
        System.out.println(getGraph());
        Assert.assertEquals(13, getGraph().V());
        Assert.assertEquals(13, getGraph().E());
    }

    @Test
    public void testGraphs() throws Exception {
        Graph g = getGraph();
        String s = "";
        for (int w : g.adj(7))
            s += w + " ";
        System.out.println("V7: "+s);
        System.out.println("V7 Degree="+Graphs.degree(g,7));
        System.out.println("Max Degree="+Graphs.maxDegree(g));
        System.out.println("Avg Degree="+Graphs.averageDegree(g));
        System.out.println("Self Loops="+Graphs.numberOfSelfLoops(g));
    }
}
