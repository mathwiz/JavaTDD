package algorithms.sorting;

/**
 * Created by Yohan on 1/26/14.
 */
public class MergeBUSort<T>  extends MergeSort<T> {
    @Override
    public void sort(Comparable<T>[] a, SortingIterationHandler<T> iterationHandler) {
        aux = new Comparable[a.length];
        int N = a.length;
        for (int sz = 1; sz < N; sz = sz + sz)
            for (int lo = 0; lo < N - sz; lo += sz + sz){
                int mid = lo + sz -1;
                int hi = Math.min(lo + sz + sz - 1, N - 1);
                merge(a, lo, mid, hi);
//                System.out.println(String.format("lo %d mid %d hi %d", lo, mid, hi));
                iterationHandler.handle(a);
            }
    }
}
