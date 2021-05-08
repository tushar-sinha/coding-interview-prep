https://leetcode.com/problems/intersection-of-two-linked-lists/

//Brute force

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headA != null) {
            ListNode n = headB;
            while(n != null) {
                if(headA == n) {
                    return headA;
                }
                n = n.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
// O(n^2)
// ==============================================================================


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        int count1 = 0;
        while(n1 != null) {
            count1++;
            n1 = n1.next;
        }
        ListNode n2 = headB;
        int count2 = 0;
        while(n2 != null) {
            count2++;
            n2 = n2.next;
        }
        ListNode temp1, temp2;
        
        if(count1>count2) {
            temp1 = headA;
            temp2 = headB;
        } else {
            temp1 = headB;
            temp2 = headA;
        }
        int c = Math.abs(count1-count2);
        while(c>0) {
            c--;
            temp1 = temp1.next;
        }
        while(temp1 != null && temp2 != null) {
            if(temp1==temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
//O(n)

// =====================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        int count1 = 0;
        while(n1 != null) {
            count1++;
            n1 = n1.next;
        }
        ListNode n2 = headB;
        int count2 = 0;
        while(n2 != null) {
            count2++;
            n2 = n2.next;
        }
        ListNode temp1, temp2;
        
        if(count1>count2) {
            temp1 = headA;
            temp2 = headB;
        } else {
            temp1 = headB;
            temp2 = headA;
        }
        int c = Math.abs(count1-count2);
        while(c>0) {
            c--;
            temp1 = temp1.next;
        }
        while(temp1 != temp2 ) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}