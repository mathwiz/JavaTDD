package algorithms.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/17/14.
 */
public class StackTest {
    Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new LinkedListStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    }

    @Test
    public void testPush() throws Exception {
        int i = stack.size();
        for(Integer each : stack) {
            Assert.assertEquals(i--, each.intValue());
        }
    }

    @Test
    public void testPop() throws Exception {
        int i = stack.size();
        for(Integer each = stack.pop(); !stack.isEmpty(); each = stack.pop()) {
            Assert.assertEquals(i--, each.intValue());
        }
    }
}
