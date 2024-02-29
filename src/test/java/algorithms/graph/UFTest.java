package algorithms.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import tdd.util.FileIn;
import tdd.util.Pair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Yohan on 1/26/14.
 */
@Ignore
public class UFTest {
    UF uf;
    List<Pair<Integer, Integer>> pairs;
    boolean small;

    @Before
    public void setUp() throws Exception {
        pairs = new ArrayList<Pair<Integer, Integer>>();
        FileIn in = new FileIn("UFMedium.txt");
        small = in.getFile().getName().equals("UF.txt");
        while (in.hasNextInt()) {
            Pair<Integer, Integer> pair = new Pair<Integer, Integer>(in.nextInt(), in.nextInt());
            pairs.add(pair);
        }
        in.close();
    }

    @Test
    public void testQuickFind() throws Exception {
        int n = pairs.size() - 1;
        System.out.println("\nQuickFindUF starting with N " + n);
        uf = new UF(n, new QuickFindUF());
        Date start = new Date();
        process();
        Date end = new Date();
        System.out.println("Processing took " + (end.getTime() - start.getTime()) + " milliseconds");
        doAssert();
    }

    @Test
    public void testQuickUnion() throws Exception {
        int n = pairs.size() - 1;
        System.out.println("\nQuickUnionUF starting with N " + n);
        uf = new UF(n, new QuickUnionUF());
        Date start = new Date();
        process();
        Date end = new Date();
        System.out.println("Processing took " + (end.getTime() - start.getTime()) + " milliseconds");
        doAssert();
    }

    @Test
    public void testWeightedQuickUnion() throws Exception {
        int n = pairs.size() - 1;
        System.out.println("\nWeightedQuickUnionUF starting with N " + n);
        uf = new UF(n, new WeightedQuickUnionUF());
        Date start = new Date();
        process();
        Date end = new Date();
        System.out.println("Processing took " + (end.getTime() - start.getTime()) + " milliseconds");
        doAssert();
    }

    private void process() {
        for (Pair<Integer, Integer> it : pairs) {
            if (small) {
                if (uf.connected(it.getLeft(), it.getRight()))
                    System.out.println(it.getLeft() + " connected to " + it.getRight() + " Skipping...");
                else
                    System.out.println(it.getLeft() + " not connected to " + it.getRight());
            }
            uf.union(it.getLeft(), it.getRight());
            if (small) System.out.println("Connected components " + uf.count());
        }
    }

    private void doAssert() {
        if (small) {
            Assert.assertEquals(2, uf.count());
            Assert.assertTrue(uf.connected(1, 1));
            Assert.assertTrue(uf.connected(0, 1));
            Assert.assertTrue(uf.connected(1, 0));
            Assert.assertTrue(uf.connected(0, 6));
            Assert.assertTrue(uf.connected(1, 6));
            Assert.assertTrue(uf.connected(8, 9));
            Assert.assertFalse(uf.connected(0, 9));
            Assert.assertFalse(uf.connected(1, 9));
        } else {
            Assert.assertEquals(277, uf.count());
        }
    }
}
