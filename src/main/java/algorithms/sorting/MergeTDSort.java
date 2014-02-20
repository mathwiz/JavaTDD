package algorithms.sorting;

/**
 * Created by Yohan on 1/26/14.
 */
public class MergeTDSort<T> extends MergeSort<T> {
    SortingIterationHandler<T> iterationHandler;

    @Override
    public void sort(Comparable<T>[] a, SortingIterationHandler<T> iterationHandler) {
        aux = new Comparable[a.length];
        this.iterationHandler = iterationHandler;
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable<T>[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
//        System.out.println(String.format("lo %d mid %d hi %d", lo, mid, hi));
        iterationHandler.handle(a);
    }
}
