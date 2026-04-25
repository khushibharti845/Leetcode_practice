class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestbuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestbuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestbuy);
            }
            bestbuy = Math.min(bestbuy, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
