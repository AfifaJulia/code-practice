package leetcode.arrays;

import java.util.Arrays;

/*
* EASY:: 88. Merge Sorted Array
*
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
* */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0;i<n;i++)
            nums1[m+i] = nums2[i];
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        /*
        You copy nums2 into nums1 → O(n)
Then sort the whole array → O((m+n) log(m+n))

👉 Overall: O((m+n) log(m+n))
        * */
    }
    public void merge_optimal(int[] nums1, int m, int[] nums2, int n) {
        /*
        You always place the largest remaining element at the back
        So:

        No shifting needed ✅
        No sorting needed ✅
        Everything stays efficient

        ⚡ Complexity
        Time: O(m + n)
        Space: O(1) (in-place)
        * */
        int i = m - 1;      // last element in nums1
        int j = n - 1;      // last element in nums2
        int k = m + n - 1;  // last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }


    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();

        int[] nums1 = {2, 7, 11, 0,0,0};
        int[] nums2 = {2, 8,9};
        int m = 3;
        int n= 3;
        System.out.println(Arrays.toString(nums1) + " , " + Arrays.toString(nums2));
        sol.merge(nums1, m, nums2, n);

    }

}
