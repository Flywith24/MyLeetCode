package leetcode;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 */
public class Leetcode509 {
    public int fib1(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fib1(n - 1) + fib1(n - 2);
    }

    public int fib2(int n) {
        if (n == 0) return 0;
        int[] arr = new int[n + 1];
        return helper(arr, n);
    }

    private int helper(int[] arr, int n) {
        if (n == 1 || n == 2) return 1;
        if (arr[n] != 0) return arr[n];
        arr[n] = helper(arr, n - 1) + helper(arr, n - 2);
        return arr[n];
    }

    public int fib3(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int fib4(int n) {
        if (n == 1 || n == 2) return 1;
        int curr = 1;
        int prev = 1;
        for (int i = 3; i < n; i++) {
            int sum = curr + prev;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

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
