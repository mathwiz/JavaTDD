package algorithms.data;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 1/25/14.
 */
public class QueueTest {
    Queue<String> q;

    @Before
    public void setUp() throws Exception {
        q = new LinkedListQueue<String>();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        q.enqueue("E");
    }

    @Test
    public void testQueue() throws Exception {
        System.out.println("Queue has " + q.size() + " items");
        for (String s = null; !q.isEmpty(); ) {
            System.out.println(q.dequeue());
        }
    }

}
