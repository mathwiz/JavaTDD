package examples.io;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;

/**
 * Created by Yohan on 9/4/2015.
 */
public class NIOTest {
    URL url;

    @Before
    public void setUp() throws Exception {
        url = Thread.currentThread().getContextClassLoader().getResource("lorem_ipsum.txt");
    }

    @Test(expected = IOException.class)
    public void testFileReader() throws Exception {
        InputStream is = null;
        try {
            is = new FileInputStream(url.getFile());
            output(System.out, is);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    protected void output(PrintStream outputStream, InputStream is) throws Exception {
        try (InputStreamReader reader = new InputStreamReader(is)) {
            readFile(outputStream, reader);
        }
        System.out.println("Try Again");
        try (InputStreamReader reader = new InputStreamReader(is)) {
            readFile(outputStream, reader);
        }
        outputStream.println(is);
    }

    private void readFile(PrintStream out, InputStreamReader reader) throws IOException {
        try (BufferedReader buf = new BufferedReader(reader)) {
            for (String s = buf.readLine(); s != null; s = buf.readLine()) {
                out.println(s);
            }
        }
    }
}
