/*
 * LeetCode 122 - Best Time to Buy and Sell Stock II
 *
 * Approach:
 * Traverse the array once and add every positive price difference
 * between consecutive days. This greedily captures every profitable
 * transaction and maximizes the total profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Greedy, Profit Accumulation
 */

package arrays;

public class LC122_BestTimetoBuyandSellStock_II {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=0; i<prices.length-1; i++){
            if (prices[i+1]>prices[i]){
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}
