package algorithms.graph;

/**
 * Created by Yohan on 1/26/14.
 */
public class UF {
    private State state;
    private UFStrategy strategy;

    public UF(int n, UFStrategy strategy) {
        this.state = new State(n);
        this.strategy = strategy;
        this.strategy.setState(this.state);
    }

    public void union(int p, int q) {
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
        private int N;

        public State(int n) {
            N = n;
        }

        public int count() {
            return N;
        }

        public void decrement() {
            N--;
        }
    }
}
