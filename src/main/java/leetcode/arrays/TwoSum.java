package leetcode.arrays;

import java.util.*;

/**
 * * EASY
 * Problem: 1: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Description:
 * Given an array of integers nums and an integer target...
 *
 * Approach:
 * - Use HashMap to store value -> index
 * - Check if (target - current) exists
 *
 * Time: O(n)
 * Space: O(n)
 */
public class TwoSum {

    // LeetCode-style solution
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    // Local testing
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}