/*
 * LeetCode 438 - Find All Anagrams in a String
 *
 * Approach:
 * Use a fixed-size sliding window equal to the length of p.
 * Maintain frequency arrays for the pattern and the current
 * window. Whenever both frequency arrays match, record the
 * starting index of the window.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 *
 * Pattern: Sliding Window, Fixed Window, Frequency Counting
 */

package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC438_FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        int[] sFreq = new int[26];
        int[] pFreq = new int[26];
        List<Integer> ans = new ArrayList<>();
        int left =0;


        for(char ch : p.toCharArray()){
            pFreq[ch - 'a']++;
        }

        for (int right =0; right < s.length(); right++){
            sFreq[s.charAt(right)-'a']++;

            if((right - left+1) > p.length()){
                sFreq[s.charAt(left)-'a']--;
                left++;
            }

            if((right - left+1) == p.length()){
                if(Arrays.equals(sFreq, pFreq)){
                    ans.add(left);
                }
            }
        }
        return ans;
    }
}
