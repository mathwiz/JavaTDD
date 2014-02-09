package algorithms.sorting;

/**
 * Created by Yohan on 2/9/14.
 */
public class IterationPrintingSort<T> implements SortingAlgorithm<T> {
    private IterationProcessingSortingAlgorithm<T> alg;

    public IterationPrintingSort(IterationProcessingSortingAlgorithm<T> a) {
        alg = a;
    }

    @Override
    public void sort(Comparable<T>[] a) {
        alg.sort(a, new SortingIterationHandler<T>() {
            @Override
            public void handle(Comparable<T>[] a) {
                Sorts.show(a);
            }
        });
    }
}
