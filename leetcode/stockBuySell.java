// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii


class Solution {
    public int maxProfit(int[] prices) {
        //brute force
        int valley = prices[0];
        int peak = prices[0];
        int i=0;
        int maxprofit = 0;
        while(i < prices.length - 1) {
            while(i<prices.length-1 && prices[i] >= prices[i+1]) i++;
            valley = prices[i];
            while(i<prices.length-1 && prices[i] < prices[i+1]) i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}

// peak and valley approach >>>>> search for valley and immediate peak -> take the difference add to profit