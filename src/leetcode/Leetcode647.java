package leetcode;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 */
public class Leetcode647 {
    public int countSubstrings(String s) {
        int result = s.length();
        int i, j;
        for (i = 0; i < s.length(); i++) {
            j = i + 1;
            while (j < s.length()) {
                if (isReverse(i, j, s)) result++;
                j++;
            }
        }
        return result;
    }

    private boolean isReverse(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
