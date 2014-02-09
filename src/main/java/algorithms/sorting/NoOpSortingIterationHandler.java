package algorithms.sorting;

/**
 * Created by Yohan on 2/9/14.
 */
public class NoOpSortingIterationHandler<T> implements SortingIterationHandler<T> {
    @Override
    public void handle(Comparable<T>[] a) {
        //do nothing
    }
}
