package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class Leetcode98 {

    boolean isValid = true;
    private List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        helper(root);
        return isValid;
    }

    private void helper(TreeNode root) {
        if (root == null || !isValid) return;
        helper(root.left);
        if (list.size() != 0 && root.val <= list.get(list.size() - 1)) isValid = false;
        list.add(root.val);
        helper(root.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
