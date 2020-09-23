package leetcode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class Leetcode19 {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 两次遍历
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        length = length - n;
        head = preHead;
        while (length != 0) {
            length--;
            head = head.next;
        }
        head.next = head.next.next;

        return preHead.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode first = preHead;
        ListNode second = preHead;
        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return preHead.next;
    }
}
