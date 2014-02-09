package algorithms.sorting;

/**
 * Created by Yohan on 2/9/14.
 */
public interface IterationProcessingSortingAlgorithm<T> {
    void sort(Comparable<T>[] a, SortingIterationHandler<T> iterationHandler);
}
