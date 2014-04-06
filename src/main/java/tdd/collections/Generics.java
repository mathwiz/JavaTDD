package tdd.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Yohan on 2/18/14.
 */
public class Generics {
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number it : nums) {
            s += it.doubleValue();
        }
        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) {
            ints.add(i);
        }
    }

    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.set(i, src.get(i));
        }
    }

    public static void show1(List<Number> nums) {
        for (Number n : nums) {
            System.out.println(n);
        }
    }

    public static void show2(List<? extends Number> nums) {
        for (Number n : nums) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Number> nums = new ArrayList<Number>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        show1(nums);
        System.out.println("--");
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(3);
        ints.add(5);
        //show1(ints);
        show2(ints);
    }
}
