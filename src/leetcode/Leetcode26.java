package leetcode;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Leetcode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        // 双指针，慢指针 i ，快指针 j 遇到相同的数据就跳过，
        // 遇到不同的数据将其赋值给 慢指针 i + 1 指向的位置
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
