package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/group-anagrams/
 */
public class Leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        Arrays.sort(strs);
        for (String item : strs) {
            char[] temp = item.toCharArray();
            Arrays.sort(temp);
            if (map.containsKey(String.valueOf(temp))) {
                map.get(String.valueOf(temp)).add(item);
            } else {
                List<String> list = new ArrayList<>();
                list.add(item);
                map.put(String.valueOf(temp), list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
