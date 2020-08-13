package leetcode;

/**
 * https://leetcode-cn.com/problems/power-of-two/
 */
public class Leetcode231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
