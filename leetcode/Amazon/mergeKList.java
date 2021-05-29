 /**
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []
 

Constraints:

k == lists.length
0 <= k <= 10^4
0 <= lists[i].length <= 500
-10^4 <= lists[i][j] <= 10^4
lists[i] is sorted in ascending order.
The sum of lists[i].length won't exceed 10^4.
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) {
            if(lists[0] == null) {return null; }
            else return lists[0];
        }
        ListNode head = merge2(lists[0], lists[1]);
        
        for(int i=2; i<lists.length; i++) {
            head = merge2(head, lists[i]);
        }
        return head;
    }
    public ListNode merge2(ListNode n1, ListNode n2) {
        if(n1 == null && n2 == null) {
            return null;
        }
        if(n1 == null) return n2;
        if(n2 == null) return n1;
        ListNode ptr, res;
        if(n1.val < n2.val) {
            ptr = new ListNode(n1.val);
            n1 = n1.next;
        } else {
            ptr = new ListNode(n2.val);
            n2 = n2.next;
        }
        res = ptr;
        while(n1 !=null && n2 != null) {
            if(n1.val<n2.val) {
                ptr.next = new ListNode(n1.val);
                n1 = n1.next;
            } else {
                ptr.next = new ListNode(n2.val);
                n2 = n2.next;
            }
            ptr = ptr.next;
        }
        if(n1 != null) {
            while(n1 != null) {
                ptr.next = new ListNode(n1.val);
                n1 = n1.next;
                ptr = ptr.next;
            }
        } else if(n2 != null) {
            while(n2 != null) {
                ptr.next = new ListNode(n2.val);
                n2 = n2.next;
                ptr = ptr.next;
            }
        }
        
        return res;
    }
}