package algorithms.sorting;

import java.io.PrintStream;

/**
 * Created by Yohan on 2/9/14.
 */
public class IterationPrintingSort<T> extends IterationDecorator<T> {
    PrintStream output;

    public IterationPrintingSort(SortingAlgorithm<T> alg) {
        this(alg, System.out);
    }

    public IterationPrintingSort(SortingAlgorithm<T> alg, PrintStream out) {
        super(alg);
        output = out;
        iterationHandler = new SortingIterationHandler<T>() {
            @Override
            public void handle(Comparable<T>[] a) {
                Sorts.show(a, output);
            }
        };
    }

}
