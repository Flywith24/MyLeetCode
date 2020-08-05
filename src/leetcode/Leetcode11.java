package leetcode;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Leetcode11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;
        while (i < j) {
            result = height[i] < height[j] ?
                    Math.max(result, (j - i) * height[i++]) :
                    Math.max(result, (j - i) * height[j--]);
        }
        return result;
    }
}
