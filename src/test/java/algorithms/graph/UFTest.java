package algorithms.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 1/26/14.
 */
public class UFTest {
    UF uf;
    List<Integer> sites;

    @Before
    public void setUp() throws Exception {
        sites = new ArrayList<Integer>();
        uf = new UF(sites.size(), new QuickUF());
    }

    @Test
    public void testConnected() throws Exception {

    }
}
