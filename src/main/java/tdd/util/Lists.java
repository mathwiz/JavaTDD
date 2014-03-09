package tdd.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yohan on 3/9/14.
 */
public abstract class Lists {
    public static <A, B> List<B> map(List<A> items, Function<A, B> fn) {
        if (items == null) {
            return null;
        }
        List<B> results = new ArrayList<B>(items.size());
        for (A it : items) {
            results.add(fn.apply(it));
        }
        return results;
    }

    public static <A> List<A> filter(List<A> items, Predicate<A> fn) {
        if (items == null) {
            return null;
        }
        List<A> results = new ArrayList<A>(items.size());
        for (A it : items) {
            if (fn.apply(it)) results.add(it);
        }
        return results;
    }
}
