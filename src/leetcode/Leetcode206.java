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

    ListNode temp;//后驱节点

    /**
     * 反转链表前 N 个节点
     */
    public ListNode reverseList(ListNode head, int n) {
        // base case
        if (n == 1) {
            // 记录第 n + 1 个节点
            temp = head.next;
            return head;
        }

        // 以 head.next 为起点，需要反转前 n - 1 个节点
        ListNode last = reverseList(head.next, n - 1);
        head.next.next = head;
        // 让反转之后的 head 节点和后面的节点连起来
        head.next = temp;

        return last;
    }
}
