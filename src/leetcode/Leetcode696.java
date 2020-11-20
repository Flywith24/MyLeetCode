package leetcode;

/**
 * https://leetcode-cn.com/problems/count-binary-substrings/
 */
public class Leetcode696 {
    public int countBinarySubstrings(String s) {
        int cur = 0, n = s.length(), ans = 0, last = 0;
        while (cur < n) {
            int count = 0;
            char c = s.charAt(cur);
            while (cur < n && s.charAt(cur) == c) {
                ++cur;
                ++count;
            }
            ans = Math.min(count, last);
            last = count;
        }
        return ans;
    }
}
