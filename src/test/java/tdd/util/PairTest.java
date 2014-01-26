package tdd.util;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/26/14.
 */
public class PairTest {
    Pair<Integer, Pair> first;

    @Before
    public void setUp() throws Exception {
        first = new Pair<Integer, Pair>(0, null);
    }

    @Test
    public void testCons() throws Exception {

    }
}
