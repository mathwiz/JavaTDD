package tdd.equality;

import org.junit.Assert;
import org.junit.Test;
import tdd.model.Callaway;
import tdd.model.GolfBall;
import tdd.model.Nike;
import tdd.model.Titleist;

/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 1/1/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class EqualityTest {
    private static GolfBall[] makeData() {
        return new GolfBall[]{
                new GolfBall("Maxfli", "Pro", 100),
                new GolfBall("Maxfli", "Regular", 90),
                new GolfBall("Titleist", "Pro V1", 100),
                new Titleist("Pro V1", 100),
                new Nike("Pro", 100),
                new Nike("Amateur", 90),
                new Callaway("Pro", 100),
                new Callaway("Amateur", 90)
        };
    }

    @Test
    public void testInstanceOf() throws Exception {
        GolfBall[] data = makeData();
        Assert.assertTrue("parent", data[0] instanceof GolfBall);
        Assert.assertTrue("subclass", data[3] instanceof GolfBall);
    }

    @Test
    public void testEquals() throws Exception {
        GolfBall[] data = makeData();
        Assert.assertEquals("same data", data[2], data[3]);
    }
}
