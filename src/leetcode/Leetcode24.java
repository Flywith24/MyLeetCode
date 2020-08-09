package leetcode;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class Leetcode24 {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode rest = head.next.next;

        ListNode newHead = head.next;
        newHead.next = head;
        head.next = swapPairs(rest);

        return newHead;
    }
}
