/*
LeetCode 1 - Two Sum

Approach:
Use a HashMap to store number -> index pair.
For each element, check if its complement
(target - current number) already exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package hashmap;

import java.util.HashMap;

public class LC001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if( hMap.containsKey(complement)){
                result[0] = hMap.get(complement);
                result[1] = i;
            }
            else{
                hMap.put(nums[i], i);
            }
        }
        return result;
    }
}
