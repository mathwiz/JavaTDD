package tdd.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Yohan on 3/9/14.
 */
public abstract class Maps {
    public static <K, T> Map<K, List<T>> multimap(List<T> items, Function<T, K> extractor) {
        Map<K, List<T>> map = new HashMap<K, List<T>>();
        for (T it : items) {
            K key = extractor.apply(it);
            List<T> a = map.get(key);
            if (a == null) {
                a = new LinkedList<T>();
                map.put(key, a);
            }
            a.add(it);
        }
        return map;
    }
}
