/*
 * LeetCode 169 - Majority Element
 *
 * Approach:
 * Use a HashMap to count the frequency of each element.
 * Return the element as soon as its frequency becomes
 * greater than n / 2.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Pattern: HashMap, Frequency Counting
 */

package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class LC169_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = nums.length/2;
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if (map.get(num) > majority){
                return num;
            }
        }
        return -1;
    }
}
