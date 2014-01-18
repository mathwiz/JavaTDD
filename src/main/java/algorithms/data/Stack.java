package algorithms.data;

/**
 * Created by yohanlee on 1/18/14.
 */
public interface Stack<E> extends Collection<E> {
    void push(E item);
    E pop();
}
