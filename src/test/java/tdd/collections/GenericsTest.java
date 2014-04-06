package tdd.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 4/6/2014.
 */
public class GenericsTest {
    @Before
    public void setUp() throws Exception {

    }
    
    @Test
    public void testPut() throws Exception {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        double d = Generics.sum(ints);
//        nums.add(3); //add cannot be applied to int
//        nums.add(3.1); //of course this is no better
        System.out.println(nums);
        System.out.println("Sum of nums = " + d);
        Assert.assertEquals(3.0, d, .01);
    }
}
