package leetcode;

/**
 * https://leetcode-cn.com/problems/remove-element/
 */
public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int ans = nums.length;
        //双指针，一个指头，一个指尾
        for (int i = 0; i < ans; ) {
            if (nums[i] == val) {
                //相等则赋值并挪动尾部指针
                nums[i] = nums[ans - 1];
                ans--;
            } else {
                //不相等则挪动头部指针
                i++;
            }
        }
        return ans;
    }
}
