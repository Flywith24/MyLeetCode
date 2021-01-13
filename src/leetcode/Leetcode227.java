package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode227 {
    public static void main(String[] args) {
        Leetcode227 a = new Leetcode227();
        a.calculate("3/2");
    }

    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int num = 0;
        char sign = '+';
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char item = s.charAt(i);
            if (Character.isDigit(item)) {
                num = 10 * num + (item - '0');
            }
            if ((!Character.isDigit(item) && ' ' != item) || i == n - 1) {

                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
                sign = item;
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
