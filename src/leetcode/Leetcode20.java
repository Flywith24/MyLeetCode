package leetcode;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Leetcode20 {
    public static void main(String[] args) {
        new Leetcode20().isValid("");
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.empty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.empty();
    }
}
