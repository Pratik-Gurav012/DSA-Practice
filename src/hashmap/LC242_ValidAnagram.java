/*
 * LeetCode 242 - Valid Anagram
 *
 * Approach:
 * Count the frequency of each character in the first string
 * using a HashMap. Traverse the second string and decrease
 * the corresponding frequency. If a character is missing or
 * its frequency becomes negative, the strings are not anagrams.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Pattern: HashMap, Frequency Counting
 */


package hashmap;

import java.util.HashMap;

public class LC242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> map = new HashMap <> ();

        if (s.length() != t.length()){
            return false;
        }

        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : t.toCharArray()){
                int count = map.getOrDefault(ch, 0)-1;
                if (count < 0){
                    return false;
                }
                map.put(ch, count);
        }
        return true;
    }
}
