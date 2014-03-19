package tdd.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 3/18/14.
 */
public class Syntaxer<E> {
    private List<E> elems;

    public Syntaxer() {
        this.elems = new ArrayList<E>();
    }

    public E getHead() {
        return elems.size() > 0 ? elems.get(0) : null;
    }

    public static void main(String[] args) {
        Syntaxer<Integer> s = new Syntaxer<>();
        System.out.println(s.elems);
    }
}
