package algorithms.data;

import java.util.Iterator;

/**
 * Created by Yohan on 1/17/14.
 */
public class Bag<E> extends LinkedListDataStructure<E> {

    public void add(E item) {
        Node<E> oldFirst = first;
        first = new Node<E>();
        first.setItem(item);
        first.setNext(oldFirst);
        n++;
    }

}
