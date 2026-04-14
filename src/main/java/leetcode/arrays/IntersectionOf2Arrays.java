package leetcode.arrays;

import java.util.*;

/**
 * * EASY
 * Problem: 349. Intersection of Two Arrays
 * Link: https://leetcode.com/problems/majority-element/
 *
 * Description:
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 *
 *
 *
 *
 *
 */


public class IntersectionOf2Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2 = nums2.length;


        Map<Integer, Integer> map1 = new HashMap<>();
        Set<Integer>  resultSet = new HashSet<>();


        for(int i = 0;i<len1;i++)
            map1.put(nums1[i],1);
        for(int i = 0;i<len2;i++)
            if(map1.containsKey(nums2[i]))
                resultSet.add(nums2[i]);

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }

    public int[] intersectionUsingMap(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2 = nums2.length;


        Set<Integer> set1 = new HashSet<>();
        Set<Integer>  resultSet = new HashSet<>();


        for(int i = 0;i<len1;i++)
            set1.add(nums1[i]);
        for(int i = 0;i<len2;i++)
            if(set1.contains(nums2[i]))
                resultSet.add(nums2[i]);

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionOf2Arrays sol = new IntersectionOf2Arrays();

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] output = sol.intersection(nums1, nums2);
        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " -> " + Arrays.toString(output));

        nums1 = new int[]{1,1};
        nums2 = new int[]{1,2,2,1};
        output = sol.intersection(nums1, nums2);
        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " -> " + Arrays.toString(output));

        nums1 = new int[]{1,2,2,1};
        nums2 = new int[]{1,1};
        output = sol.intersection(nums1, nums2);
        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " -> " + Arrays.toString(output));
    }
}