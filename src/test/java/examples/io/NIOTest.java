package examples.io;

import org.junit.Before;
import org.junit.Test;

import java.net.URL;

/**
 * Created by Yohan on 9/4/2015.
 */
public class NIOTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testFileReader() throws Exception {
        URL url = Thread.currentThread().getContextClassLoader().getResource("lorem_ipsum.txt");

    }
}
