package algorithms.sorting;

/**
 * Created by Yohan on 2/8/14.
 */
public class ShellSort<T> implements SortingAlgorithm<T> {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                Sorts.show(a);
                for (int j = i; j >= h && Sorts.less(a[j], a[j - h]); j -= h) {
                    Sorts.exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
