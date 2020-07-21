package leetcode;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class Leetcode151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
