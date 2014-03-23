package algorithms.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/26/14.
 */
public class PartitionTest extends SortTest {
    @Before
    public void setUp() throws Exception {
        super.setUp();
        Sorts.show(a);
    }

    @Test
    public void testPartition() throws Exception {
        System.out.println("Partition");
        Assert.assertFalse(Sorts.isSorted(a));
        Sorts.partition(a, 0, a.length - 1);
        Sorts.show(a);
    }
}
