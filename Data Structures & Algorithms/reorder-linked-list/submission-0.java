/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode last = null;
        ListNode curr = slow.next;
        slow.next = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = last;
            last = curr;
            curr = temp;

        }
        
        ListNode first = head;
        while (last != null) {
            ListNode temp = first.next;
            first.next = last;
            first = temp;

            temp = last.next;
            last.next = first;
            last = temp;
        }

    }
}
