package tdd.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 5/26/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MutabilityTest {
    private Mutability m;

    @Before
    public void setUp() {
        m = new Mutability();
    }

    @Test
    public void testArray() throws Exception {
        String[] arr = m.getArray();
        m.getArray()[0] = "0";
        Assert.assertNotNull(m.getArray());
        Assert.assertEquals("0", arr[0]);
        arr[0] = "zero";
        Assert.assertEquals("zero", m.getArray()[0]);
    }
}
