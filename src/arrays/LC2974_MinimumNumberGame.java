/*
LeetCode 2974 - Minimum Number Game

Approach:
1. Sort the array making it easy to get minimum numbers.
2. Swap every adjacent pair.
3. Store the result in a new array.

Time Complexity: O(n log n) --> because of the Arrays.sort() complexity.
Space Complexity: O(n)
*/

package arrays;

import java.util.Arrays;

public class LC2974_MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        for (int i=0; i< nums.length; i+=2){
            result[i] = nums[i+1];
            result[i+1] = nums[i];
        }
        return result;

    }
}
