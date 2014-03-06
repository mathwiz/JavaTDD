package tdd.math;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by Yohan on 3/5/14.
 */
public class Rounder {
    private float[] nums;
    private int[] rounds;
    private int sumOfRounds;
    private double sumOfNums;

    Rounder(int n) {
        nums = new float[n];
        rounds = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            nums[i] = r.nextFloat();
            rounds[i] = Math.round(nums[i]);
            sumOfNums += nums[i];
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
//        for (int i = 0; i < this.size(); i++) {
//            System.out.println(String.format("%f %d", nums[i], rounds[i]));
//        }
        System.out.println(String.format("%f %d %d", sumOfNums, Math.round(sumOfNums), sumOfRounds));
    }

    public static void main(String[] args) {
        int N = 1000000;
        Map<Long, Integer> results = new TreeMap<Long, Integer>();
        double sumOfSquares = 0.0;
        for (int i = 0; i < N; i++) {
            Rounder r = new Rounder(100);
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
