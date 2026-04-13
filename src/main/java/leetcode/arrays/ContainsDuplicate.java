package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * EASY
 * Problem: 217: Contains Duplicate
 * Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Description:
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Approach:
 * - Use HashMap to store value -> index
 * - Check if value exists
 *
 * Time: O(n)
 * Space: O(n)
 */

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(numMap.containsKey(nums[i]))
                return true;
            numMap.put(nums[i], i);
        }


        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};
        boolean result = sol.containsDuplicate(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);

        nums = new int[]{1, 2, 3, 4};
        result = sol.containsDuplicate(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);

        nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        result = sol.containsDuplicate(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);
    }
}
