/*
 * LeetCode 14 - Longest Common Prefix
 *
 * Approach:
 * Sort the array of strings lexicographically.
 * After sorting, the common prefix of the first and last strings
 * is the longest common prefix for the entire array.
 * Compare both strings character by character until they differ.
 *
 * Time Complexity: O(n log n × m)
 * Space Complexity: O(1) (excluding the output StringBuilder)
 *
 * Pattern: Sorting, String Traversal
 */

package strings;

import java.util.Arrays;

public class LC014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int minLength = Math.min(first.length(), last.length());
        StringBuilder result = new StringBuilder();

        for (int i =0; i< minLength; i++){
            if (first.charAt(i) == last.charAt(i)){
                result.append(first.charAt(i));
            }
            else break;
        }

        return result.toString();

    }
}

