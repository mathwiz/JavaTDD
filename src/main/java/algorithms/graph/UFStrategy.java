package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public interface UFStrategy {
    void setState(UF.State state);

    void union(int p, int q);

    int find(int p);

}
