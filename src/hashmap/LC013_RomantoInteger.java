/*
LeetCode 13 - Roman to Integer

Approach:
Traverse the string from left to right.
If the current Roman numeral is smaller than the next one,
subtract it; otherwise add it.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package hashmap;

import java.util.HashMap;

public class LC013_RomantoInteger {
    public int romanToInt(String s) {

        int total =0;
        HashMap<Character, Integer> romanValues = new HashMap<>(7);
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);



        for (int i=0; i<s.length(); i++){

            if(i+1<s.length() && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))){
                total -= romanValues.get(s.charAt(i));
            }
            else total += romanValues.get(s.charAt(i));
        }
        return total;
    }
}
