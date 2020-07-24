package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/3sum/
 */
public class Leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return lists;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = len - 1;
            int current = nums[i];
            while (left < right) {
                int sum = current + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(current);
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    lists.add(tempList);

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return lists;
    }
}
