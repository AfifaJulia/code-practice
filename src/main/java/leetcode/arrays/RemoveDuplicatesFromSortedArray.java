package leetcode.arrays;

import java.util.Arrays;

/*
* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
*
* */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int count =1;

        for(int i=1;i<nums.length; i++){
            if(nums[i]!=nums[i-1])
                nums[count++]=nums[i];
        }

        return count;
    }

    public int[] removeDuplicatesArray(int[] nums) {

        int[] result = new int[nums.length];
        int count =0;
        for(int num: nums){
            if(count==0)
                result[count++]=num;
            else if(num>result[count-1])
                result[count++]=num;
        }
//        for(;count<nums.length;count++)
//            result[count]=-1;
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();

        int[] nums = {1,1,2};

        int count = sol.removeDuplicates(nums);
        int[] output = sol.removeDuplicatesArray(nums);
        System.out.println(Arrays.toString(nums) + " -> " +count+", "+ Arrays.toString(output));

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        count = sol.removeDuplicates(nums);
        output = sol.removeDuplicatesArray(nums);
        System.out.println(Arrays.toString(nums) + " -> " +count+", "+ Arrays.toString(output));

        nums = new int[]{0,0,1,1,1,3,3,4,5,5,5,6,6,7};
        count = sol.removeDuplicates(nums);
        output = sol.removeDuplicatesArray(nums);
        System.out.println(Arrays.toString(nums) + " -> " +count+", "+ Arrays.toString(output));
    }
}

