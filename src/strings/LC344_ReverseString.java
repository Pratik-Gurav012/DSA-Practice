/*
 * LeetCode 344 - Reverse String
 *
 * Approach:
 * Use two pointers, one at the beginning and one at the end of the array.
 * Swap the characters at both pointers and move them towards the center
 * until the pointers meet.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Two Pointers
 */

package strings;

public class LC344_ReverseString {
    public void reverseString(char[] s) {
        int left =0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right]= temp;
            left++;
            right--;
        }
    }
}
