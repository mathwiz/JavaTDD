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
        return new MultiMapper<K, T>(items, accessor).map();
    }

    protected final Method getMethod(Class c, String name) {
        try {
            return c.getMethod(name);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private class MultiMapper<K, T> {
        List<T> data;
        Method method;

        MultiMapper(List<T> input, Method m) {
            data = input;
            method = m;
        }

        K getKey(T item) {
            try {
                return  (K) method.invoke(item);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        Map<K, List<T>> map() {
            Map<K, List<T>> map = new HashMap<K, List<T>>();
            for (T it : data) {
                K key = getKey(it);
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
