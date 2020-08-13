package leetcode;

/**
 * https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class Leetcode191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            ++count;
        }
        return count;
    }
}
