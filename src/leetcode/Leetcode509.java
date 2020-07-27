package leetcode;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 */
public class Leetcode509 {
    public int fib(int n) {
        if (n < 2) return n;
        if (n == 2) return 1;
        int current = 1;
        int prev1 = 1;
        int prev2 = 0;

        for (int i = 3; i < n; i++) {
            current = prev1 + prev2;
            prev1 = current;
            prev2 = prev1;
        }
        return current;
    }
}
