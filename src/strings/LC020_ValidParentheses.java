/*
 * LeetCode 20 - Valid Parentheses
 *
 * Approach:
 * Use a stack to store opening brackets. When a closing
 * bracket is encountered, it must match the most recent
 * opening bracket. If a mismatch occurs or the stack is
 * empty, the string is invalid. At the end, the stack
 * must be empty.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Pattern: Stack, LIFO, Matching Pairs
 */

package strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC020_ValidParentheses {
    boolean isOpening(char ch){
        return ch == '(' || ch == '{' || ch == '[';
    }

    boolean isMatching(char opening , char ch){
        return  opening == '(' && ch == ')' ||
                opening == '{' && ch == '}' ||
                opening == '[' && ch == ']';
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()){
            if (isOpening(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char opening = stack.pop();

                if(!isMatching(opening, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
