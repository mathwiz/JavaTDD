package tdd.json;

import org.junit.Before;
import org.junit.Test;
import tdd.model.Callaway;
import tdd.model.GolfBall;
import tdd.model.Nike;
import tdd.model.Titleist;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

/**
 * Created by Yohan on 1/16/14.
 */
public class JsonMapperTest {
    private static List<GolfBall> makeData() {
        return Arrays.asList(new GolfBall[] {
                new GolfBall("Maxfli", "Pro", 100),
                new GolfBall("Maxfli", "Regular", 90),
                new GolfBall("Titleist", "Pro V1", 100),
                new Titleist("Pro V1", 100),
                new Nike("Pro", 100),
                new Nike("Amateur", 90),
                new Callaway("Pro", 100),
                new Callaway("Amateur", 90)
        });
    }

    String json;

    @Before
    public void setUp() throws Exception {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("example.json");
        Scanner s = new Scanner(in).useDelimiter("\\A");
        json = s.next();
    }

    @Test
    public void testDeserialize() throws Exception {
    }

    @Test
    public void testSerialize() throws Exception {
        JsonMapper mapper = new JsonMapper();
        List<GolfBall> list = makeData();
        String s = mapper.serialize(list);
        System.out.println(s);
    }
}
