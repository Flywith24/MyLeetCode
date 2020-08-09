package leetcode;

/**
 * https://leetcode-cn.com/problems/plus-one/
 */
public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        int add = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = i == digits.length - 1 ? digits[i] + 1 + add : digits[i] + add;
            digits[i] = temp % 10;
            add = temp / 10;
        }
        if (add > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }
}
