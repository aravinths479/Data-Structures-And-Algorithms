// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// https://www.youtube.com/watch?v=3RHCb8LY-X4

public class BestTimeSellStock {
    public static int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min_value){
                min_value = prices[i];
            }
            int diff = prices[i] - min_value;
            if(diff > max_profit ){
                max_profit = prices[i] - min_value;
            }
        }

        return max_profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
