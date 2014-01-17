package tdd.json;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Yohan on 1/16/14.
 */
public class JsonMapperTest {
    String json;

    @Before
    public void setUp() throws Exception {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("example.json");
        Scanner s = new Scanner(in).useDelimiter("\\A");
        json = s.next();
    }

    @Test
    public void testDeserialize() throws Exception {
        System.out.println(json);
    }

    @Test
    public void testSerialize() throws Exception {
        System.out.println(json);
    }
}
