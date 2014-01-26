package tdd.util;

/**
 * Created by Yohan on 1/26/14.
 */
public class Pair<E, F> {
    private E left;
    private F right;

    public Pair(E left, F right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public F getRight() {
        return right;
    }
}
