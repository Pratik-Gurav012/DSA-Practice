/*
 * LeetCode 238 - Product of Array Except Self
 *
 * Approach:
 * Compute the prefix product and suffix product for each index.
 * Multiply the corresponding prefix and suffix products to get
 * the product of all elements except the current one.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Pattern: Prefix Product, Suffix Product, Precomputation
 */

package arrays;

public class LC238_ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;

        for (int i=1; i<nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        for (int i=nums.length-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for (int i=0; i< nums.length; i++){
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
