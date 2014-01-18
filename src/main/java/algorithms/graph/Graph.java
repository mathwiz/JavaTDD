package algorithms.graph;

import algorithms.data.Bag;
import algorithms.data.LinkedListBag;

import java.util.Arrays;

/**
 * Created by yohanlee on 1/18/14.
 */
public class Graph {
    private final int V;            //number of vertices
    private int E;                  //number of edges
    private Bag<Integer>[] adj;     //adjacency lists

    public Graph(int v) {
        V = v;
        E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedListBag<Integer>();
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    @Override
    public String toString() {
        String s = "Graph{" +
                "V=" + V +
                ", E=" + E +
                "}\n";
        for (int i = 0; i < V; i++) {
            s += i + ": ";
            for (int w : this.adj(i))
                s += w + " ";
            s += "\n";
        }
        return s;
    }
}
