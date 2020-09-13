package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */
public class Leetcode589 {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if (root == null) return;
        result.add(root.val);
        for (Node child : root.children) {
            helper(child);
        }
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
