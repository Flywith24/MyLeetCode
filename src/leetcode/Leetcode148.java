package leetcode;

/**
 * https://leetcode-cn.com/problems/reorder-list/
 */
public class Leetcode148 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void reorderList(ListNode head) {
        if (head == null) return;

        ListNode middle = middle(head);
        ListNode right = middle.next;
        middle.next = null;

        right = reverse(right);

        merge(head, right);

    }

    private void merge(ListNode left, ListNode right) {
        ListNode tempLeft;
        ListNode tempRight;
        while (left != null && right != null) {

            tempLeft = left.next;
            tempRight = right.next;

            left.next = right;
            right.next = tempLeft;

            left = tempLeft;
            right = tempRight;
        }
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    private ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
