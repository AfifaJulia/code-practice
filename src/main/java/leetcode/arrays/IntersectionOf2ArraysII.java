package leetcode.arrays;

import java.util.*;

/**
 * * EASY
 * Problem: 350. Intersection of Two Arrays II
 *
 * Description:
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 *
 */


public class IntersectionOf2ArraysII {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2 = nums2.length;

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> resultMap = new HashMap<>();


        for(int i = 0;i<len1;i++)
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        for(int i = 0;i<len2;i++)
            map2.put(nums2[i], map2.getOrDefault(nums2[i],0)+1);

        int resultSize = 0;
        for(int num: map.keySet())
            if(map2.containsKey(num)){
                int x = map.get(num);
                int y = map2.get(num);
                resultMap.put(num,Math.min(x,y));
                resultSize+=Math.min(x,y);
            }

        int[] result = new int[resultSize];
        int i = 0;
        for (int key: resultMap.keySet()) {
            int v = resultMap.get(key);
            for(;v>0;v--)
                result[i++]=key;
        }
        return result;
    }


    public static void main(String[] args) {
        IntersectionOf2ArraysII sol = new IntersectionOf2ArraysII();

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
