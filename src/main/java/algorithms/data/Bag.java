package algorithms.data;

import java.util.Iterator;

/**
 * Created by Yohan on 1/17/14.
 */
public class Bag<E> implements Iterable<E> {
    private Node<E> first;
    private int n;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void add(E item) {
        Node<E> oldFirst = first;
        first = new Node<E>();
        first.setItem(item);
        first.setNext(oldFirst);
        n++;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E item = current.getItem();
                current = current.getNext();
                return item;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove not available");
            }
        };
    }
}
