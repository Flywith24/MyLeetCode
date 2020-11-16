package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode394 {
    public static void main(String[] args) {
        decodeString("3[a]2[bc]");
    }
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Deque<Integer> dStack = new ArrayDeque<>();
        Deque<Character> cStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (Character.isDigit(item)) {
                //入数字栈
                dStack.push(Integer.parseInt(String.valueOf(item)));
            } else if (']' != item) {
                //入字符栈
                cStack.push(item);
            } else {
                //出栈
                int size = dStack.pop();
                StringBuilder temp = new StringBuilder();
                while ('[' != cStack.peekLast()) {
                    temp.append(cStack.pop());
                }
                for (int j = 0; j < size; j++) {
                    result.append(temp.reverse());
                }
            }
        }
        return result.toString();
    }
}
