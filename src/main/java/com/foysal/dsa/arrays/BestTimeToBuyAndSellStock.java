package com.foysal.dsa.arrays;

public class BestTimeToBuyAndSellStock {  //LeetCode 121
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = Math.max(maxProfit, prices[i] - prices[i - 1]);
                prices[i] = prices[i - 1];
            }
        }
        return maxProfit;
    }
}
