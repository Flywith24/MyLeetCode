package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/backspace-string-compare/
 */
public class Leetcode844 {
    public static void main(String[] args) {
        Leetcode844 l = new Leetcode844();
        boolean b = l.backspaceCompare("abcd", "bbcd");
        System.out.println("hhh " + b);
    }

    public boolean backspaceCompare(String S, String T) {
        Deque<Character> stack1 = new LinkedList<>();
        Deque<Character> stack2 = new LinkedList<>();
        for (Character item : S.toCharArray()) {
            if ('#' == item) {
                if (!stack1.isEmpty()) stack1.pop();
            } else {
                stack1.push(item);
            }
        }
        for (Character item : T.toCharArray()) {
            if ('#' == item) {
                if (!stack2.isEmpty()) stack2.pop();
            } else {
                stack2.push(item);
            }
        }
        if (stack1.size() == stack2.size()) {
            while (!stack1.isEmpty())
                if (stack1.pop() != stack2.pop()) return false;
            return true;
        } else {
            return false;
        }
    }
}
