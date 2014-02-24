package algorithms.sorting;

import java.io.PrintStream;

/**
 * Created by Yohan on 1/26/14.
 */
public class Sorts {
    public static void sort(Comparable[] a, SortingAlgorithm algorithm) {
        algorithm.sort(a);
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        show(a, System.out);
    }

    public static void show(Comparable[] a, PrintStream out) {
        for (int i = 0; i < a.length; i++)
            out.print(a[i] + " ");
        out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1]))
                return false;
        return true;
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        for (; ; ) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
