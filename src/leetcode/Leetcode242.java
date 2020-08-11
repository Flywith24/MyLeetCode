package leetcode;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int item : arr) {
            if (item != 0) return false;
        }
        return true;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c))
                if (map.get(c) == 1) map.remove(c);
                else map.put(c, map.get(c) - 1);
            else return false;
        }
        return map.isEmpty();
    }
}
