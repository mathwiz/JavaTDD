package examples.io;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by Yohan on 1/19/14.
 */
public class TextFileHelperTest {
    TextFileHelper helper;

    @Before
    public void setUp() throws Exception {
        URL url = Thread.currentThread().getContextClassLoader().getResource("lorem_ipsum.txt");
        System.out.println(url);
        helper = new TextFileHelper(new File(url.getFile()));
    }

    @Test
    public void testReadLine() throws Exception {
        for (String line = helper.readLine(); line != null; line = helper.readLine())
            System.out.println(line);
    }

    @Test
    public void testIterator() throws Exception {
        for (String line : helper.getLines())
            System.out.println(line);
    }
}
