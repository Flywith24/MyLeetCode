package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 */
public class Leetcode590 {
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

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    void helper(List<Integer> list, Node root) {
        if (root == null) return;
        for (Node node : root.children) helper(list, node);
        list.add(root.val);
    }
}
