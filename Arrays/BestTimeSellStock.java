// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.
    
// https://www.youtube.com/watch?v=1pkOgXD63yU


public class BestTimeSellStock {
    public static int maxProfit(int[] prices) {
        // Initialize the minimum price to the first element in the array
        int minPrice = prices[0];
        // Initialize the maximum profit to 0
        int maxProfit = 0;
        
        // Iterate through the array of prices
        for (int i = 0; i < prices.length; i++) {
            // If the current price is lower than the minimum price seen so far
            if (prices[i] < minPrice) {
                // Update the minimum price
                minPrice = prices[i];
            } else {
                // Calculate the difference between the current price and the minimum price
                int diff = prices[i] - minPrice;
                // Update the maximum profit if the calculated difference is greater
                maxProfit = Math.max(maxProfit, diff);
            }
        }
        
        // Return the maximum profit
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
