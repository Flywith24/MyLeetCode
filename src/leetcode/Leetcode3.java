package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int left = 0, right = 0; right < s.length(); right++) {
            char temp = s.charAt(right);
            if (map.containsKey(temp)) left = Math.max(left, map.get(temp));
            ans = Math.max(ans, right - left + 1);
            map.put(temp, right + 1);
        }
        return ans;
    }
}
