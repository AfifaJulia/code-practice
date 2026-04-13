package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * EASY
 * Problem: 283: MoveZeros
 * Link: https://leetcode.com/problems/move-zeroes/
 *
 * Description:
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Approach:
 * - Move all non-zero elements forward
 * - Fill remaining with zeros
 *
 * Time: O(n)
 * Space: O(n)
 */

public class MoveZeros {
    public int[] moveZeroes(int[] nums) {

        int insertPos = 0;
        int[] output = new int[nums.length];
        // Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                output[insertPos++] = num;
            }
        }

        // Fill remaining with zeros
        while (insertPos < nums.length) {
            output[insertPos++] = 0;
        }

        return output;
    }

    public static void main(String[] args) {
        MoveZeros sol = new MoveZeros();

        int[] nums = {0,1,0,3,12};

        int[] output = sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(output));

        nums = new int[]{1, 0, 0,2, 3, 0, 4};
        output = sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(output));

        nums = new int[]{0,0,1,0,1,3,3,0,3,2,0,5,0,5,4,0,2};
        output = sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(output));
    }
}
