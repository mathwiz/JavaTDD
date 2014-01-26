package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public interface UFStrategy {
    UF.State createState(int n);

    void union(int p, int q);

    int find(int p);

}
