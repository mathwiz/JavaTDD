package algorithms.graph;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yohanlee on 1/18/14.
 */
public class GraphTest {
    Graph g;

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

    @Test
    public void testGetSizes() throws Exception {
        System.out.println(g);
        Assert.assertEquals(13, g.V());
        Assert.assertEquals(13, g.E());
    }

    @Test
    public void testGraphs() throws Exception {
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