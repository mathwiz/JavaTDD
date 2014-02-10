package algorithms.sorting;

/**
 * Created by Yohan on 1/26/14.
 */
public class MergeSort<T> implements SortingAlgorithm<T>, IterationProcessingSortingAlgorithm<T> {
    private  Comparable<T>[] aux;

    @Override
    public void sort(Comparable<T>[] a) {
        sort(a, new NoOpSortingIterationHandler<T>());
    }

    @Override
    public void sort(Comparable<T>[] a, SortingIterationHandler<T> iterationHandler) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1, iterationHandler);
    }

    private void sort(Comparable<T>[] a, int lo, int hi, SortingIterationHandler iterationHandler) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid, iterationHandler);
        sort(a, mid + 1, hi, iterationHandler);
        merge(a, lo, mid, hi);
        System.out.println(String.format("lo %d mid %d hi %d", lo, mid, hi));
        iterationHandler.handle(a);
    }

    private void merge(Comparable<T>[] a, int lo, int mid, int hi) {
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
