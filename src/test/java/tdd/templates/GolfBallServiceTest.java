package tdd.templates;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import tdd.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Yohan on 3/9/14.
 */
public class GolfBallServiceTest {
    GolfBallService service;

    @Before
    public void setUp() throws Exception {
        service = new GolfBallService(new GolfBallDao() {
            @Override
            public List<GolfBall> findAll() {
                return Arrays.asList(
                        new Titleist("Pro V1", 100),
                        new Titleist("Pro V1", 90),
                        new Nike("One", 90),
                        new Callaway("HX Hot", 80),
                        new Callaway("HX Tour", 90),
                        new Srixon("Z Star", 90),
                        new Srixon("Soft Feel", 71)
                );
            }
        });
    }

    @Test
    public void testIndexByBrand() throws Exception {
        Map<String, List<GolfBall>> map = service.indexByBrand();
        Assert.assertEquals(2, map.get("Callaway").size());
        Assert.assertEquals(1, map.get("Nike").size());
        Assert.assertEquals(2, map.get("Titleist").size());
    }

    @Test
    public void testIndexByCompression() throws Exception {
        Map<Integer, List<GolfBall>> map = service.indexByCompression();
        Assert.assertEquals(1, map.get(100).size());
        Assert.assertEquals(4, map.get(90).size());
        Assert.assertEquals(1, map.get(80).size());
    }
}
