package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * EASY
 * Problem: 219: Contains Duplicate II
 * Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Description:
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Approach:
 * - Use HashMap to store value -> index
 * - Check if value exists
 *
 * Time: O(n)
 * Space: O(n)
 */

public class ContainsDuplicate2 {

    public boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(numMap.containsKey(nums[i]) && Math.abs(i-numMap.get(nums[i]))<=k)
                return true;
            numMap.put(nums[i], i);
        }


        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate2 sol = new ContainsDuplicate2();

        int[] nums = {1, 2, 3, 1};
        int k=3;
        boolean result = sol.containsDuplicate(nums,k);
        System.out.println(Arrays.toString(nums) + ", k = "+k+" -> " + result);

        nums = new int[]{1, 2, 3, 4};
        result = sol.containsDuplicate(nums,k);
        System.out.println(Arrays.toString(nums) + ", k = "+k+" -> " + result);

        nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        result = sol.containsDuplicate(nums,k);
        System.out.println(Arrays.toString(nums) + ", k = "+k+" -> " + result);
    }
}
