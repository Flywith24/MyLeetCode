package leetcode;

/**
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Leetcode70 {
    public int climbStairs(int n) {
        int p;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
