/*
LeetCode 387 - First Unique Character in a String

Approach:
1. Count frequency of each character using HashMap with the first loop.
2. Traverse the string again and return the first character
   whose frequency is 1 using second loop.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package hashmap;

import java.util.HashMap;

public class LC387_FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> uniChar = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            uniChar.put(s.charAt(i), uniChar.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i=0; i< s.length(); i++){
            if (uniChar.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }
}
