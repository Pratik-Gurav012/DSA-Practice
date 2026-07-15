/*
 * LeetCode 724 - Find Pivot Index
 *
 * Approach:
 * Calculate the total sum of the array. Traverse the array
 * while maintaining left and right running sums.
 * Remove the current element from the right sum before
 * comparing, then add it to the left sum after comparing.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Prefix Sum, Running Sum
 */

package arrays;

public class LC724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int rightsum =0;
        int leftsum =0;
        for(int num : nums){
            rightsum += num;
        }

        for (int i=0; i<nums.length; i++){
            rightsum -= nums[i];
            if (leftsum == rightsum){
                return i;
            }
            leftsum+= nums[i];
        }
        return -1;
    }
}
