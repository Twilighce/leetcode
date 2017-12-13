class Solution {

	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) {
			return 0;
		}
		int maxProfit = 0;
		int bought = prices[0];

		for(int i = 0; i < prices.length; i++) {
			if(prices[i] > bought) {
				//sell
				if(prices[i] - bought > maxProfit) {
					maxProfit = prices[i] - bought;
				} 				
			} else {
				bought = prices[i];
			}
		}
		return maxProfit;
	}
}


/*

Kadane's Algorithm:
	https://en.wikipedia.org/wiki/Maximum_subarray_problem

	public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

Why maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]); ?

Well, we can assume opt(i) as the max Profit you will get if you sell the stock at day i;

We now face two situations:

We hold a stock at day i, which means opt(i) = opt(i - 1) - prices[i - 1] + prices[i] (max Profit you can get if you sell stock at day(i-1) - money you lose if you buy the stock at day (i-1) + money you gain if you sell the stock at day i.

We do not hold a stock at day i, which means we cannot sell any stock at day i. In this case, money we can get at day i is 0;

opt(i) is the best case of 1 and 2.

So, opt(i) = Max{opt(i - 1) - prices[i - 1] + prices[i], 0}	

*/