package leetcode;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class Leetcode80 {
    public int removeDuplicates(int[] nums) {

        int i = 1;
        int count = 1;//重复项出现次数
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                //计数加1
                count++;
            } else {
                count = 1;
            }
            //遇到两个以上相同的值跳过
            if (count <= 2) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Leetcode80 leetcode = new Leetcode80();
        System.out.println(leetcode.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}