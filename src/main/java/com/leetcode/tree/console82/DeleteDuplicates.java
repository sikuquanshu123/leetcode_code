package com.leetcode.tree.console82;

import com.leetcode.link.ListNode;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next=head;
        ListNode cur = dummyNode;

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x=cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next=cur.next.next;
                }
            }else {
                cur=cur.next;
            }
        }
        return dummyNode.next;
    }
}
