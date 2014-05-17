package tdd.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Yohan on 5/16/2014.
 */
public class MostFrequent {

    private List<Integer> nums;

    public MostFrequent(List<Integer> nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        List<Integer> vals = Arrays.asList(2, 3, 1, 2, 1, 2, 3, 3);
        System.out.println(String.format("Most frequent element is %s", new MostFrequent(vals).find1()));
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
}
