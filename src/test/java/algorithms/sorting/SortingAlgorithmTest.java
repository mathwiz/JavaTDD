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
        System.out.println("Selection Sort");
        Sorts.sort(a, new SelectionSort<String>());
        Sorts.show(a);
    }


    @Test
    public void testInsertionSort() throws Exception {
        System.out.println("Insertion Sort");
        Sorts.sort(a, new InsertionSort<String>());
        Sorts.show(a);
    }
}
