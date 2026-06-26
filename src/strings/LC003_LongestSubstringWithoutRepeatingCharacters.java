/*
 * LeetCode 3 - Longest Substring Without Repeating Characters
 *
 * Approach:
 * Use a sliding window with a HashSet to maintain unique
 * characters. Expand the window by moving the right pointer.
 * If a duplicate is found, shrink the window from the left
 * until the duplicate is removed.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Pattern: Sliding Window, HashSet, Two Pointers
 */
package strings;

import java.util.HashSet;


public class LC003_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> chSet = new HashSet<>();
        int left =0;
        int right =0;
        int longestSubstring = 0;

        while (right < s.length()){
            if (!chSet.contains(s.charAt(right))){
                chSet.add(s.charAt(right));
                longestSubstring = Math.max(longestSubstring, chSet.size());
                right++;
            } else {
                chSet.remove(s.charAt(left));
                left++;
            }
        }
        return longestSubstring;
    }
}
