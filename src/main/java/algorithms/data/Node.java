package algorithms.data;

/**
 * Created by Yohan on 1/17/14.
 */
public class Node<E> {
    E item;
    Node<E> next;

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
