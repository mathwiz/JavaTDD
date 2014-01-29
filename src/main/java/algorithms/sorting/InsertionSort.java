package algorithms.sorting;

/**
 * Created by Yohan on 1/26/14.
 */
public class InsertionSort<T> implements SortingAlgorithm<T> {
    @Override
    public void sort(Comparable<T>[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && Sorts.less(a[j], a[j-1]); j--) {
                Sorts.exch(a, j, j-1);
            }
        }
    }
}
