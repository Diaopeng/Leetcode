/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null ){
            while(current != null && current.next!= null && current.val == current.next.val ){
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}
