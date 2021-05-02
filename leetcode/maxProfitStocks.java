// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<prices.length; j++) {
                
                int profit = prices[j]-prices[i];
                if(profit>maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        
        return maxprofit;
    }
}

// =============================================================

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i]-minPrice > maxprofit) {
                maxprofit = prices[i]-minPrice;
            }
        }
        
        return maxprofit;
    }
}