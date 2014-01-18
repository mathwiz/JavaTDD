package algorithms.data;

/**
 * Created by Yohan on 1/17/14.
 */
public class LinkedListStack<E> extends LinkedListDataStructure<E> implements Stack<E> {

    public void push(E item) {
        Node<E> oldFirst = first;
        first = new Node<E>();
        first.setItem(item);
        first.setNext(oldFirst);
        n++;
    }

    public E pop() {
        E item = first.getItem();
        first = first.getNext();
        n--;
        return item;
    }
}
