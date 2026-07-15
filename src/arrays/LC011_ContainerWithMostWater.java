/*
 * LeetCode 11 - Container With Most Water
 *
 * Approach:
 * Use two pointers at both ends of the array.
 * Calculate the area formed by the two lines.
 * Move the pointer with the smaller height inward,
 * since only a taller line can potentially increase
 * the maximum area.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Two Pointers, Greedy
 */

package arrays;

public class LC011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while (left < right){
            int currentArea = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]){
                left++;
            }
            else right--;
        }
        return maxArea;
    }
}
