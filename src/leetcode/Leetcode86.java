package leetcode;

/**
 * https://leetcode-cn.com/problems/partition-list/
 */
public class Leetcode86 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode leftHead = new ListNode(0);
        ListNode left = leftHead;
        ListNode rightHead = new ListNode(0);
        ListNode right = rightHead;

        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }
}
