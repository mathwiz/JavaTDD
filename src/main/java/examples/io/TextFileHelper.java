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

    public void reset() {
        try {
            reader.reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean ready() {
        try {
            return reader.ready();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Iterable<? extends String> getLines() {
        return new Iterable<String>() {
            private String first = readLine();

            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private String current = first;

                    @Override
                    public boolean hasNext() {
                        return current != null;
                    }

                    @Override
                    public String next() {
                        String item = current;
                        current = readLine();
                        return item;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
