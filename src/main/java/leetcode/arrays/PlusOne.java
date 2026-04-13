package leetcode.arrays;

import java.util.Arrays;

/**
 * * EASY
 * Problem: 66. Plus One
 * Link: https://leetcode.com/problems/two-sum/
 *


 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

 Increment the large integer by one and return the resulting array of digits.
 Approach:
 * - Traverse from right to left
 * - Handle carry by converting 9 → 0
 * - If all digits are 9, create new array
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for(int i=length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] result=new int[length+1];

        result[0]=1;
        for(int i =0;i<length;i++)
            result[i+1]=digits[i];

        return result;

    }
    public static void main(String[] args) {
        PlusOne sol = new PlusOne();

        int[] input = {4,3,2,1};
        int[] nums = input;

        int[] result = sol.plusOne(input);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(result));

        input = new int[]{9};
        nums = input;
        result = sol.plusOne(input);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(result));

        input = new int[]{1,4,9};
        nums = input;
        result = sol.plusOne(input);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(result));

        input = new int[]{9,9};
        nums = input;
        result = sol.plusOne(input);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(result));

        input = new int[]{9,9,9};
        nums = input;
        result = sol.plusOne(input);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(result));

    }
}
