package tdd.templates;

import tdd.model.Equipment;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Yohan on 3/9/14.
 */
public abstract class EquipmentService<T extends Equipment> {
    public final Map<String, List<T>> indexByBrand(List<T> items) {
        Map<String, List<T>> map = new HashMap<String, List<T>>();
        for (T it : items) {
            List<T> a = map.get(it.getBrand());
            if (a == null) {
                a = new LinkedList<T>();
                map.put(it.getBrand(), a);
            }
            a.add(it);
        }
        return map;
    }

    public final <K> Map<K, List<T>> index(List<T> items, Method accessor) {
        Mapper<K, T> mapper = new Mapper<K, T>(items, accessor);
        return mapper.map();
    }

    protected final Method getMethod(Class c, String name) {
        try {
            Method m = c.getMethod(name);
            return m;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private class Mapper<K, T> {
        List<T> data;
        Method method;

        Mapper(List<T> input, Method m) {
            data = input;
            method = m;
        }

        Map<K, List<T>> map() {
            Map<K, List<T>> map = new HashMap<K, List<T>>();
            for (T it : data) {
                K key = null;
                try {
                    key = (K) method.invoke(it);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
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
}
