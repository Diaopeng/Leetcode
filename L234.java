/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;
        ListNode start = reverse(slow);
        while(start != null){
            if(start.val != head.val)
                return false;
            start = start.next;
            head = head.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode head){
        ListNode newHead = null, now = head;
        while(now != null){
            ListNode next = now.next;
            now.next = newHead;
            newHead = now;
            now = next;
        }
        return newHead;
    }
}
