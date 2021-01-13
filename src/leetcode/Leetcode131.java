package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/palindrome-partitioning/
 */
public class Leetcode131 {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack(s, 0, new ArrayDeque<String>());
        return res;
    }

    private void backtrack(String s, int start, Deque<String> path) {
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (!isPalindrome(s, start, i)) continue;
            path.addLast(s.substring(start, i + 1));
            backtrack(s, i + 1, path);
            path.removeLast();
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
