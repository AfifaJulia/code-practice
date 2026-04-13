package leetcode.arrays;

import java.util.Arrays;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
121. Best Time to Buy and Sell Stock

Description:
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Approach:
Instead of checking all pairs, I track the minimum price so far and compute profit in one pass

* */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy here
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // sell here
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock sol = new BestTimeToBuyAndSellStock();

        int[] prices = {7,1,5,3,6,4};
        int result = sol.maxProfit(prices);
        System.out.println(Arrays.toString(prices) + " -> " + result);

        prices = new int[]{7,6,4,3,1};
        result = sol.maxProfit(prices);
        System.out.println(Arrays.toString(prices) + " -> " + result);

        prices = new int[]{1,1,1,3,3,4,3,2,4,2};
        result = sol.maxProfit(prices);
        System.out.println(Arrays.toString(prices) + " -> " + result);
    }
}
