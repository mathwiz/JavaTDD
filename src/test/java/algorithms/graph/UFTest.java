package algorithms.graph;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import tdd.util.FileIn;
import tdd.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 1/26/14.
 */
public class UFTest {
    UF uf;
    List<Pair<Integer, Integer>> pairs;

    @Before
    public void setUp() throws Exception {
        pairs = new ArrayList<Pair<Integer, Integer>>();
        FileIn in = new FileIn("UF.txt");
        while (in.hasNextInt()) {
            Pair<Integer, Integer> pair = new Pair<Integer, Integer>(in.nextInt(), in.nextInt());
            pairs.add(pair);
        }
    }

    @Test
    public void testQuick() throws Exception {
        int n = pairs.size() - 1;
        System.out.println("\nQuickUF starting with N " + n);
        uf = new UF(n, new QuickUF());
        process();
        doAssert();

    }

    private void process() {
        for (Pair<Integer, Integer> it : pairs) {
            if (uf.connected(it.getLeft(), it.getRight()))
                System.out.println(it.getLeft() + " connected to " + it.getRight() + " Skipping...");
            else
                System.out.println(it.getLeft() + " not connected to " + it.getRight());
            uf.union(it.getLeft(), it.getRight());
            System.out.println("Connected components " + uf.count());
        }
    }

    private void doAssert() {
        Assert.assertEquals(2, uf.count());
        Assert.assertTrue(uf.connected(1, 1));
        Assert.assertTrue(uf.connected(0, 1));
        Assert.assertTrue(uf.connected(1, 0));
        Assert.assertTrue(uf.connected(0, 6));
        Assert.assertTrue(uf.connected(1, 6));
        Assert.assertTrue(uf.connected(8, 9));
        Assert.assertFalse(uf.connected(0, 9));
        Assert.assertFalse(uf.connected(1, 9));
    }
}
