package leetcode;

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class Leetcode104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
