package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
public class Leetcode22 {
    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(0, 0, n, "");
        return result;
    }

    private void generate(int left, int right, int n, String s) {
        // 终止条件
        if (left == n && right == n) {
            result.add(s);
            return;
        }
        //括号合法条件：左括号小于n,右括号小于左括号
        // 递归
        if (left < n)
            generate(left + 1, right, n, s + "(");

        if (right < left)
            generate(left, right + 1, n, s + ")");
    }

    public static void main(String[] args) {
        new Leetcode22().generateParenthesis(3);
    }
}