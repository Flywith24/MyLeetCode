package leetcode;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class Leetcode5 {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < 2 * s.length() - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                String temp = s.substring(left, right + 1);
                if (temp.length() > result.length()) result = temp;
                left--;
                right++;
            }
        }

        return result;
    }
}
