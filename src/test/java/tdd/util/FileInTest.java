package tdd.util;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

/**
 * Created by Yohan on 1/26/14.
 */
@Ignore
public class FileInTest {
    File file;
    FileIn fileIn;

    @Before
    public void setUp() throws Exception {
        URL url = Thread.currentThread().getContextClassLoader().getResource("UF.txt");
        file = new File(url.getFile());
        fileIn = new FileIn("UF.txt");
    }

    @Test
    public void readFile() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("\nReading from file " + file.getAbsolutePath());
        for (String it = reader.readLine(); it != null; it = reader.readLine()) {
            System.out.println(it);
        }
    }

    @Test
    public void testNextInt() throws Exception {
        System.out.println("\nIntegers in " + fileIn.getFile().getAbsolutePath());
        while (fileIn.hasNextInt())
            System.out.println(fileIn.nextInt());
    }
}
