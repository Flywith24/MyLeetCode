package leetcode;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class LeetCode83 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            while (current.next != null && current.val == current.next.val)
                current.next = current.next.next;
            current = current.next;
        }
        return head;
    }
}
