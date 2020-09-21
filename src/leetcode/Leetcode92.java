package leetcode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class Leetcode92 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre = null;
        ListNode end = null;
        ListNode start = null;
        ListNode current = head;
        int pos = 0;
        while (current != null) {
            ++pos;
            if (pos < m) {
                end = current;
            } else if (pos >= m && pos <= n) {
                if (pos == m) {
                    start = current;
                }
                ListNode temp = current.next;
                current.next = pre;
                pre = current;
                current = temp;
                if (pos == n) {
                    if (end != null) end.next = pre;
                    if (start != null) start.next = current;
                }
            }
        }
        return head;
    }
}
