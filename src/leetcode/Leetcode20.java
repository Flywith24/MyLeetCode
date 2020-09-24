package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Leetcode20 {
    public static void main(String[] args) {
        new Leetcode20().isValid("");
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char item : s.toCharArray()) {
            if ('(' == item) stack.push(')');
            else if ('[' == item) stack.push(']');
            else if ('{' == item) stack.push('}');
            else if (stack.isEmpty() || stack.pop() != item) return false;
        }
        return stack.isEmpty();
    }
}
