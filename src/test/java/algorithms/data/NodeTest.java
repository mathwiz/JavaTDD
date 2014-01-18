package algorithms.data;

import org.junit.Test;

/**
 * Created by Yohan on 1/17/14.
 */
public class NodeTest {
    @Test
    public void testCreate() throws Exception {
        Node<String> n = new Node<String>();
        n.setItem("Hello World");
        n.setNext(null);
        System.out.println(n.getItem());
    }
}
