package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * * EASY
 * Problem: 169. Majority Element
 * Link: https://leetcode.com/problems/majority-element/
 *
 * Description:
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 *
 * Time: O(n)
 * Space: O(n)
 */


public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for(int i=0;i<len;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
                map.put(nums[i], 1);

            if(map.get(nums[i])>len/2)
                return  nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        int[] nums = {2,2,1,1,1,2,2};
        int result = sol.majorityElement(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);

        nums = new int[]{4,6,4,3,4};
        result = sol.majorityElement(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);

        nums = new int[]{2,2,1};
        result = sol.majorityElement(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);

        nums = new int[]{2};
        result = sol.majorityElement(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);
    }

}