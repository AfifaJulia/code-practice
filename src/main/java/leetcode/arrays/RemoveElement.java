package leetcode.arrays;

import java.util.Arrays;

/*
27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
* 
* */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int num: nums){
            if(num!=val)
                nums[count++]=num;
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElement sol = new RemoveElement();

        int[] nums = {3,2,2,3};
        int val = 3;

        int count = sol.removeElement(nums, val);
        System.out.println(Arrays.toString(nums) + " -> " +count);

        nums = new int[]{0,1,2,2,3,0,4,2};
        val = 2;
        count = sol.removeElement(nums, val);
        System.out.println(Arrays.toString(nums) + " -> " +count);

        nums = new int[]{0,0,1,1,1,3,3,4,5,5,5,6,6,7};
        count = sol.removeElement(nums,val);
        System.out.println(Arrays.toString(nums) + " -> " +count);
    }
}

