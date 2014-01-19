package examples.io;

import java.io.*;
import java.util.Iterator;

/**
 * Created by Yohan on 1/18/14.
 */
public class TextFileHelper {
    private BufferedReader reader;

    public TextFileHelper(File file) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(file));
    }

    public void reset() throws IOException {
        reader.reset();
    }

    public boolean ready() throws IOException {
        return reader.ready();
    }

    public void close() throws IOException {
        reader.close();
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }
}
