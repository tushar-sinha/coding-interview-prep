// Given the head of a singly linked list, reverse the list, and return the reversed list.

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, prev = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}