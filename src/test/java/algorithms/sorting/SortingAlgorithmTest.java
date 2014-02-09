package algorithms.sorting;

import junit.framework.Assert;
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
    public void testShellSort() throws Exception {
        System.out.println("Shell Sort");
        Assert.assertFalse(Sorts.isSorted(a));
        Sorts.sort(a, new IterationPrintingSort(new ShellSort<String>()));
        Assert.assertTrue(Sorts.isSorted(a));
    }

    @Test
    public void testSelectionSort() throws Exception {
        System.out.println("Selection Sort");
        Assert.assertFalse(Sorts.isSorted(a));
        Sorts.sort(a, new IterationPrintingSort(new SelectionSort<String>()));
        Assert.assertTrue(Sorts.isSorted(a));
    }

    @Test
    public void testInsertionSort() throws Exception {
        System.out.println("Insertion Sort");
        Assert.assertFalse(Sorts.isSorted(a));
        Sorts.sort(a, new IterationPrintingSort(new InsertionSort<String>()));
        Assert.assertTrue(Sorts.isSorted(a));
    }
}
