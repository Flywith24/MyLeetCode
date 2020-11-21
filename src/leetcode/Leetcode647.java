package leetcode;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 */
public class Leetcode647 {
    //找到中心点，两边扩散
    //核心在如何找中心点，以及中心点有几个
    //如果以一个字符为中心点，那么有 n 个
    //但只考虑一个字符的情况会漏掉 abba 的情况
    //因此中心可能为一个字符或两个字符，那么个数为 2 * n - 1
    public int countSubstrings(String s) {
        int ans = 0;
        for (int center = 0; center < 2 * s.length() - 1; ++center) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }

        return ans;
    }
}
