package tdd.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yohan on 3/9/14.
 */
public class Iterables {

    public static <A> Iterable<A> filter(Iterable<A> items, Predicate<A> fn) {
        if (items == null) {
            return null;
        }
        List<A> results = new LinkedList<A>();
        for (A it : items) {
            if (fn.apply(it)) results.add(it);
        }
        return results;
    }
}
