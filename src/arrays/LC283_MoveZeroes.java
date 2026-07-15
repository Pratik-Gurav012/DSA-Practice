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

public class LC283_MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int write =0;

            for (int i=0; i<nums.length; i++){
                if (nums[i] != 0){
                    nums[write] = nums[i];
                    write++;
                }
            }
            while (write < nums.length){
                nums[write] =0;
                write++;
            }
        }
    }
}
