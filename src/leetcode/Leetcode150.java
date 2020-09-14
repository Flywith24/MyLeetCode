package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
public class Leetcode150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        Integer i1;
        Integer i2;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    i1 = stack.pop();
                    i2 = stack.pop();
                    stack.push(i2 - i1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    i1 = stack.pop();
                    i2 = stack.pop();
                    stack.push(i2 / i1);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;
            }
        }
        return stack.peek();
    }
}
