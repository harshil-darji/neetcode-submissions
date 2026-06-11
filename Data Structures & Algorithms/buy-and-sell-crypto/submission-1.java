class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1)
            return 0;
        int maxP = 0;
        int l=0; int r=1;
        while (r<len) {
            if (prices[r] > prices[l]) {
                int profit = prices[r] - prices[l];
                if (profit >= maxP)
                    maxP = profit;
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
