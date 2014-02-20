package algorithms.sorting;

/**
 * Created by Yohan on 2/18/14.
 */
public class QuickSort<T> implements SortingAlgorithm<T>, IterationProcessingSortingAlgorithm<T> {
    SortingIterationHandler<T> iterationHandler;

    @Override

    public void sort(Comparable<T>[] a) {
        sort(a, new NoOpSortingIterationHandler<T>());
    }

    @Override
    public void sort(Comparable<T>[] a, SortingIterationHandler<T> iterationHandler) {
        this.iterationHandler = iterationHandler;
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable<T>[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable<T>[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        for (; ; ) {
            iterationHandler.handle(a);
            while (Sorts.less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (Sorts.less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            Sorts.exch(a, i, j);
        }
        Sorts.exch(a, lo, j);
        return j;
    }

}
