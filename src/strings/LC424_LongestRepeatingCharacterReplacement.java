/*
 * LeetCode 424 - Longest Repeating Character Replacement
 *
 * Approach:
 * Use a variable-size sliding window and maintain the
 * frequency of characters inside the window. If the
 * number of required replacements exceeds k, shrink
 * the window until it becomes valid again.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Sliding Window, Frequency Counting, Variable Window
 */

package strings;

public class LC424_LongestRepeatingCharacterReplacement {
    int maxFreq(int[] arr){
        int i=0;
        int maxFreq =0;
        for (int count : arr){
            maxFreq = Math.max(maxFreq, count);
        }
        return maxFreq;
    }
    public int characterReplacement(String s, int k) {
        int left =0;
        int ans = 0;
        int[] freq = new int[26];

        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i) - 'A']++;

            int maxFrequency = maxFreq(freq);
            int windowLength = i - left+1;

            while (windowLength - maxFrequency > k){
                freq[s.charAt(left) - 'A']--;
                left++;
                windowLength = i - left + 1;
                maxFrequency = maxFreq(freq);
            }

            ans = Math.max(ans, windowLength);
        }
        return ans;
    }
}
