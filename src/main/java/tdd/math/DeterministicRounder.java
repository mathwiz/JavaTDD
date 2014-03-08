package tdd.math;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by Yohan on 3/5/14.
 */
public class DeterministicRounder {
    private float[] nums;
    private int[] rounds;
    private int sumOfRounds;
    private double sumOfNums;

    DeterministicRounder(int n) {
        nums = new float[n];
        rounds = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            nums[i] = r.nextFloat();
            sumOfNums += nums[i];
            rounds[i] = (int) (Math.round(sumOfNums) - sumOfRounds);
            sumOfRounds += rounds[i];
        }
    }

    public float[] getNums() {
        return nums;
    }

    public int[] getRounds() {
        return rounds;
    }

    public int getSumOfRounds() {
        return sumOfRounds;
    }

    public double getSumOfNums() {
        return sumOfNums;
    }

    int size() {
        return nums.length;
    }

    void show() {
        double runningSum = 0.0;
        int runningRoundedSum = 0;
        for (int i = 0; i < this.size(); i++) {
            runningSum += nums[i];
            runningRoundedSum += rounds[i];
            int diff = Math.round(nums[i]) - rounds[i];
            System.out.println(String.format("%08.6f %02d %f %d %s", runningSum, runningRoundedSum, nums[i], rounds[i], diff == 0 ? "" : "*"));
        }
        System.out.println(String.format("%f %d %d", sumOfNums, Math.round(sumOfNums), sumOfRounds));
    }

    public static void main(String[] args) {
        int N = 1000000;
        Map<Long, Integer> results = new TreeMap<Long, Integer>();
        double sumOfSquares = 0.0;
        for (int i = 0; i < N; i++) {
            DeterministicRounder r = new DeterministicRounder(100);
            if (i == 0) {
                r.show();
            }
            long diff = Math.round(r.getSumOfNums()) - r.getSumOfRounds();
            sumOfSquares += diff * diff;
            if (results.get(diff) == null) {
                results.put(diff, 1);
            } else {
                results.put(diff, results.get(diff) + 1);
            }
        }
        for (long diff : results.keySet()) {
            System.out.println(String.format("%+03d %d", diff, results.get(diff)));
        }
        System.out.println(String.format("Std dev %f", Math.sqrt(sumOfSquares / N)));
    }
}
