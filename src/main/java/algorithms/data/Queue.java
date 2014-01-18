package algorithms.data;

/**
 * Created by yohanlee on 1/18/14.
 */
public interface Queue<E> extends Collection<E> {
    void enqueue(E item);
    E dequeue();
}
