package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 */
public class Leetcode111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (current.left == null && current.right == null) return depth;

                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
            }
            depth++;
        }
        return depth;
    }
}
