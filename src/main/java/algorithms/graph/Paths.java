package algorithms.graph;

/**
 * Created by Yohan on 1/19/14.
 */
public interface Paths {
    boolean hasPathTo(int v);
    Iterable<Integer> pathTo(int v);
}
