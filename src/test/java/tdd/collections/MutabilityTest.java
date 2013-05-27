package tdd.collections;

import junit.framework.Assert;
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
    public void testGetStrings() throws Exception {
        Assert.assertNotNull(m);
    }
}
