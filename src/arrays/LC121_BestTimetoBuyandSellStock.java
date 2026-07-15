/*
 * LeetCode 121 - Best Time to Buy and Sell Stock
 *
 * Approach:
 * Traverse the array once while keeping track of the lowest
 * stock price seen so far. For each price, calculate the
 * profit if sold today and update the maximum profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Greedy, Running Minimum, Single Pass
 */


package arrays;

public class LC121_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int lowest =prices[0];
        int bestProfit =0;

        for (int price : prices){
            if(price < lowest) lowest = price;

            bestProfit = Math.max(bestProfit, (price-lowest));
        }
        return bestProfit;
    }
}
