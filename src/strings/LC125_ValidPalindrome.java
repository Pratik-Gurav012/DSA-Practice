/*
 * LeetCode 125 - Valid Palindrome
 *
 * Approach:
 * Convert the string to lowercase and use two pointers.
 * Skip all non-alphanumeric characters from both ends. --> Java Provides Character.isLetterOrDigit()
 * Compare the remaining characters while moving the pointers
 * towards the center.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Two Pointers
 */


package strings;

public class LC125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        s = s.toLowerCase();

        while (left < right){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
