package leetcode.arrays;

import java.util.*;

/**
 * * EASY
 * Problem: 448. Find All Numbers Disappeared in an Array
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Description:
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Time: O(n)
 * Space: O(n)
 */

public class FindAllNumsDisappearInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> listInt = new ArrayList<>();
        int length = nums.length;


        for(int i=0;i<length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
        }

        for(int i = 1; i<=length; i++){
            if(!map.containsKey(i)){
                listInt.add(i);
            }
        }
        return listInt;
    }

    public static void main(String[] args) {
        FindAllNumsDisappearInArray sol = new FindAllNumsDisappearInArray();

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> output = sol.findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums) + " -> " + output);

        nums = new int[]{1,1};
        output = sol.findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums) + " -> " + output);

        nums = new int[]{0,0,1,0,1,3,3,0,3,2,0,5,0,5,4,0,2};
        output = sol.findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums) + " -> " + output);
    }
}