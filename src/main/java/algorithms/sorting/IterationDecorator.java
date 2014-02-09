package algorithms.sorting;

/**
 * Created by Yohan on 2/9/14.
 */
public abstract class IterationDecorator<T> implements SortingAlgorithm<T> {
    protected final SortingAlgorithm<T> alg;
    protected final IterationProcessingSortingAlgorithm<T> iterationAlg;
    protected SortingIterationHandler<T> iterationHandler;

    public IterationDecorator(SortingAlgorithm<T> alg) {
        this.alg = alg;
        iterationAlg = alg instanceof IterationProcessingSortingAlgorithm ?
                (IterationProcessingSortingAlgorithm) alg : null;
        iterationHandler = new NoOpSortingIterationHandler<T>();
    }

    @Override
    public void sort(Comparable<T>[] a) {
        if (iterationAlg != null) {
            iterationAlg.sort(a, iterationHandler);
        } else {
            alg.sort(a);
        }
    }
}
