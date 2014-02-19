package tdd.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 2/18/14.
 */
public class Generics {
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
