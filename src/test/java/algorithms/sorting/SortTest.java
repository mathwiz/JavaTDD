package algorithms.sorting;

import org.junit.After;
import org.junit.Before;
import tdd.util.FileIn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 1/26/14.
 */
public abstract class SortTest {
    FileIn in;
    Comparable[] a;

    @Before
    public void setUp() throws Exception {
        in = new FileIn("sortexample.txt");
        loadArray();
    }

    protected void loadArray() {
        List<String> elems = new ArrayList<String>();
        while (in.hasNext())
            elems.add(in.next());
        a = elems.toArray(new String[elems.size()]);
    }

    @After
    public void tearDown() throws Exception {
        in.close();
    }
}
