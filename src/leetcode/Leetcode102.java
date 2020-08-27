package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class Leetcode102 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        List<Integer> first = new ArrayList<>();
        first.add(root.val);
        result.add(first);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (current.left != null) {
                    temp.add(current.left.val);
                    q.offer(current.left);
                }
                if (current.right != null) {
                    temp.add(current.right.val);
                    q.offer(current.right);
                }
                if (current.left == null && current.right == null) continue;
            }
            if (!temp.isEmpty()) result.add(temp);
        }
        return result;
    }
}
