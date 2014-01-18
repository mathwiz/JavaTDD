package algorithms.data;

/**
 * Created by Yohan on 1/17/14.
 */
public class Stack<E> extends LinkedListDataStructure<E> {

    public void push(E item) {
        Node<E> oldFirst = first;
        first = new Node<E>();
        first.setItem(item);
        first.setNext(oldFirst);
        n++;
    }

}
