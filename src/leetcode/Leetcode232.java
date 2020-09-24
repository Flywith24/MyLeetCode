package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class Leetcode232 {
    Deque<Integer> mStack1;
    Deque<Integer> mStack2;
    int mFirst;

    /**
     * Initialize your data structure here.
     */
    public Leetcode232() {
        mStack1 = new LinkedList<>();
        mStack2 = new LinkedList<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (mStack1.isEmpty()) {
            mFirst = x;
        }
        mStack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (mStack2.isEmpty()) {
            while (!mStack1.isEmpty()) {
                mStack2.push(mStack1.pop());
            }
        }
        return mStack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (mStack2.isEmpty()) {
            return mFirst;
        } else {
            return mStack2.peek();
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return mStack1.isEmpty() && mStack2.isEmpty();
    }
}
