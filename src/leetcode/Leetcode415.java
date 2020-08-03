package leetcode;

/**
 * https://leetcode-cn.com/problems/add-strings/
 */
public class Leetcode415 {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder("");
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + add;
            add = sum / 10;
            stringBuilder.append(sum % 10);
            i--;
            j--;
        }
        if (add == 1) stringBuilder.append("1");
        return stringBuilder.reverse().toString();
    }
}
