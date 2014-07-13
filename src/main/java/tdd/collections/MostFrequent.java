package tdd.collections;

import java.util.*;

/**
 * Find the most frequent integer in a list. Break ties with smallest value.
 * Created by Yohan on 5/16/2014.
 */
public class MostFrequent {

    private List<Integer> nums;

    public MostFrequent(List<Integer> nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        List<Integer> vals = Arrays.asList(-2, -3, -1, -2, -1, -2, -3, -1, -3, -3);
        MostFrequent mf = new MostFrequent(vals);
        System.out.println(String.format("Most frequent element is %s", mf.find1()));
        System.out.println(String.format("Most frequent element is %s", mf.find2()));
        System.out.println(String.format("Most frequent element is %s", mf.find3()));
    }

    protected int find1() {
        int most = Integer.MIN_VALUE;
        Map<Integer, Integer> counts = new TreeMap<>();
        for (int it : nums) {
            Integer count = counts.get(it);
            counts.put(it, count == null ? 1 : ++count);
        }
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> it : counts.entrySet()) {
            System.out.println(String.format("%s, %s", it.getKey(), it.getValue()));
            if (it.getValue() > maxCount) {
                most = it.getKey();
                maxCount = it.getValue();
            }
        }
        return most;
    }

    protected int find2() {
        int most = Integer.MIN_VALUE;
        Map<Integer, Integer> counts = new HashMap<>();
        int maxCount = 0;
        Collections.sort(nums);
        for (int it : nums) {
            Integer count = counts.get(it);
            counts.put(it, count == null ? 1 : ++count);
            if (counts.get(it) > maxCount) {
                maxCount = counts.get(it);
                most = it;
            }
        }
        return most;
    }

    protected int find3() {
        int most = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        int count = 0;
        int maxCount = 0;
        Collections.sort(nums);
        for (int it : nums) {
            System.out.println(String.format("%s %s %s %s ", it, count, maxCount, most));
            if (it == most) {
                count++;
                maxCount++;
            } else if (count == 0) {
                most = it;
                count++;
            } else if (it == last) {
                count--;
            }
            last = it;
        }
        return most;
    }
}
