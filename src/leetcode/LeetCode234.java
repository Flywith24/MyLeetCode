package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class LeetCode234 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        int size = stack.size() / 2;
        current = head;
        while (size-- != 0) {
            if (current.val != stack.pop()) return false;
            current = current.next;
        }
        return true;
    }
}
