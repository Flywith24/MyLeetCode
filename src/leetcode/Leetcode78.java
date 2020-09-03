package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/subsets/
 */
public class Leetcode78 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return result;
    }

    private void backtrack(int first, int[] nums, ArrayList<Integer> temp) {
        result.add(new ArrayList<>(temp));
        for (int i = first; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
