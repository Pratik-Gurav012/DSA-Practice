/*
LeetCode 1480 - Running Sum of 1D Array

Difficulty: Easy

Approach:
Traverse from index 1 to nums.length.
Add the previous running sum to the current element.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package arrays;

public class LC1480_RunningSumof1dArray {
    public int[] runningSum(int[] numbs) {
        for(int i =1; i < numbs.length; i++){
                numbs[i] += numbs[i-1];
        }
        return numbs;
    }
}
