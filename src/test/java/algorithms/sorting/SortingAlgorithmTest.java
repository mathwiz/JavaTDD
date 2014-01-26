package algorithms.sorting;

import org.junit.Before;
import org.junit.Test;
import tdd.util.FileIn;

/**
 * Created by Yohan on 1/26/14.
 */
public class SortingAlgorithmTest extends SortTest {
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testSelectionSort() throws Exception {
        Sorts.show(a);
        Sorts.sort(a, new SelectionSort<String>());
        Sorts.show(a);
    }
}
