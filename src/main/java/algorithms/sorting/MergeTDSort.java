package algorithms.sorting;

/**
 * Created by Yohan on 1/26/14.
 */
public class MergeTDSort<T> extends MergeSort<T> {

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
}
