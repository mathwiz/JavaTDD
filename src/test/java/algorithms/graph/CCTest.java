package algorithms.graph;

import algorithms.data.LinkedListQueue;
import algorithms.data.Queue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/29/14.
 */
public class CCTest extends GraphTest {
    CC cc;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        cc = new CC(getGraph());
    }

    @Test
    public void testConnected() throws Exception {
        Graph g = getGraph();
        int M = cc.count();
        System.out.println(M + " components");
        Queue<Integer>[] components;
        components = (Queue<Integer>[]) new Queue[M];
        for (int i = 0; i < M; i++)
            components[i] = new LinkedListQueue<Integer>();
        for (int v = 0; v < g.V(); v++)
            components[cc.id(v)].enqueue(v);
        for (int i = 0; i < M; i++) {
            for (int v : components[i])
                System.out.println(v + " ");
            System.out.println();
        }
        Assert.assertTrue(cc.connected(0, 1));
    }
}
