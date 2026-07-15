/*
 * LeetCode 567 - Permutation in String
 *
 * Approach:
 * Use a fixed-size sliding window equal to the length of s1.
 * Maintain frequency arrays for s1 and the current window in s2.
 * If both frequency arrays match, a permutation of s1 exists.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 *
 * Pattern: Sliding Window, Frequency Counting, Fixed Window
 */

package strings;

import java.util.Arrays;

public class LC567_PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Freq = new int[26];
        for(char ch : s1.toCharArray()){
            s1Freq[ch-'a']++;
        }


        int[] windowFreq = new int[26];

        int left = 0;

        if (s1.length() > s2.length()) {
            return false;
        }

        for (int right =0; right < s2.length(); right++){

            windowFreq[s2.charAt(right)-'a']++;

            if((right - left+1) > s1.length()){
                windowFreq[s2.charAt(left)-'a']--;
                left++;
            }

            if ((right - left+1) == s1.length()){
                if(Arrays.equals(s1Freq, windowFreq)){
                    return true;
                }
            }
        }
        return false;
    }
}
