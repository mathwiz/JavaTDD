package algorithms.data;

import java.util.Iterator;

/**
 * Created by Yohan on 1/25/14.
 */
public class LinkedListQueue<E> extends LinkedListDataStructure<E> implements Queue<E> {
    private Node<E> last;

    @Override
    public void enqueue(E item) {
        Node<E> oldlast = last;
        last = new Node<E>();
        last.setItem(item);
        last.setNext(null);
        if (isEmpty()) first = last;
        else oldlast.setNext(last);
        n++;
    }

    @Override
    public E dequeue() {
        E item = first.getItem();
        first = first.getNext();
        n--;
        if (isEmpty()) last = null;
        return item;
    }
}
