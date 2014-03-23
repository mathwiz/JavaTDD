package algorithms.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/17/14.
 */
public class BagTest {
    Bag<Integer> bag;

    @Before
    public void setUp() throws Exception {
        bag = new LinkedListBag<Integer>();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
    }

    @Test
    public void testAdd() throws Exception {
        int i = bag.size();
        for(Integer each : bag) {
            Assert.assertEquals(i--, each.intValue());
        }
    }
}
