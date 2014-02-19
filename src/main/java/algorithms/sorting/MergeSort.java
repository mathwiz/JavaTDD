package algorithms.sorting;

/**
 * Created by Yohan on 1/26/14.
 */
public abstract class MergeSort<T> implements SortingAlgorithm<T>, IterationProcessingSortingAlgorithm<T> {
    protected  Comparable<T>[] aux;

    @Override
    public void sort(Comparable<T>[] a) {
        sort(a, new NoOpSortingIterationHandler<T>());
    }

    protected final void merge(Comparable<T>[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (Sorts.less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
