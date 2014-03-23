package tdd.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 3/18/14.
 */
public class SyntaxerTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMain() throws Exception {
        Syntaxer<String> s = new Syntaxer<>();
        Assert.assertNull(s.getHead());
    }
}
