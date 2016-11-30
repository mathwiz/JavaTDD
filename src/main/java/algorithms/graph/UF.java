package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public class UF {
    private State state;
    private UFStrategy strategy;

    public UF(int n, UFStrategy strategy) {
        this.strategy = strategy;
        this.state = strategy.createState(n);
    }

    public void union(int p, int q) {
        if (!connected(p, q))
            strategy.union(p, q);
    }

    public int find(int p) {
        return strategy.find(p);
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return state.count();
    }

    public static class State {
        protected int[] id;
        protected int N;

        public State(int n) {
            N = n;
            id = new int[N];
            for (int i = 0; i < N; i++)
                id[i] = i;
        }

        public int[] getId() {
            return id;
        }

        public int count() {
            return N;
        }

        public void decrement() {
            N--;
        }
    }

    public static class WeightedState extends State {
        protected int[] sz;

        public WeightedState(int n) {
            super(n);
            sz = new int[N];
            for (int i = 0; i < N; i++)
                sz[i] = 1;
        }

        public int[] getSize() {
            return sz;
        }
    }
}
