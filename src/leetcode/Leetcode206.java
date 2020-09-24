package leetcode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class Leetcode206 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 迭代方式
     */
    public ListNode reverseList1(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            //指向反转
            curr.next = pre;

            // pre 与 curr 后移
            pre = curr;
            curr = temp;
        }

        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        // base case
        if (head == null || head.next == null) return head;
        ListNode last = reverseList2(head.next);

        head.next.next = head;
        head.next = null;

        return last;
    }
}
