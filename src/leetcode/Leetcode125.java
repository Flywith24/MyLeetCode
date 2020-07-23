package leetcode;

/**
 * https://leetcode-cn.com/problems/valid-palindrome/
 */
public class Leetcode125 {
    public boolean isPalindromeTowPoint(String s) {
        String lowercase = s.toLowerCase();
        int left = 0;
        int right = lowercase.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(lowercase.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(lowercase.charAt(right))) {
                right--;
            }
            if (lowercase.charAt(left) != lowercase.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindromeReserve(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                result.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return result.toString().equals(result.reverse().toString());
    }
}
