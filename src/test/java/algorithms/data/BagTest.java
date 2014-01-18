package algorithms.data;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/17/14.
 */
public class BagTest {
    LinkedListBag<Integer> bag;

    @Before
    public void setUp() throws Exception {
        bag = new LinkedListBag<Integer>();
    }

    @Test
    public void testAdd() throws Exception {
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        int i = bag.size();
        for(Integer each : bag) {
            Assert.assertEquals(i--, each.intValue());
        }
    }
}
