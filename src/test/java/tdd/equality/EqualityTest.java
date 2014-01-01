package tdd.equality;

import org.junit.Assert;
import org.junit.Test;
import tdd.model.GolfBall;

/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 1/1/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class EqualityTest {
    @Test
    public void testInstanceOf() throws Exception {
        GolfBall[] data = Equality.makeData();
        Assert.assertTrue("parent", data[0] instanceof GolfBall);
        Assert.assertTrue("subclass", data[3] instanceof GolfBall);
    }

    @Test
    public void testEquals() throws Exception {
        GolfBall[] data = Equality.makeData();
        Assert.assertEquals("same data", data[2], data[3]);
    }
}
