/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode iter = head;
        int length = 1;
        while(iter.next != null){
            iter = iter.next;
            length++;
        }
        k = k%length;
        if(k == 0)
            return head;
        iter.next = head;
        iter = iter.next;
        while(length != (k + 1)){
            iter = iter.next;
            length--;
        }
        ListNode result = iter.next;
        iter.next = null;
        return result;
        
    }
}
