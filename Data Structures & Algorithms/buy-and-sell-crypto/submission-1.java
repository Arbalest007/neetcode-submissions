class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int maxProfit = 0;

        while(sellIndex < prices.length) {
            int currentBuy = prices[buyIndex];
            int currentSell = prices[sellIndex];

            if(currentSell > currentBuy) {
                int currentProfit = currentSell - currentBuy;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
            else {
                buyIndex = sellIndex;
            }

            sellIndex++;
        }

        return maxProfit;
    }
}
