package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class Leetcode205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() < 2) return true;
        return compare(s, t) && compare(t, s);
    }

    boolean compare(String s1, String s2) {
        int size = s1.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map.containsKey(c1)) if (map.get(c1) != c2) return false;
            else map.put(c1, c2);
        }
        return true;
    }
}
