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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy,second = dummy.next;
        while(second!= null && second.next != null){
            if(second.val != second.next.val){
                first = first.next;
                second = second.next;
                continue;
            }
            while(second.val == second.next.val){
                second = second.next;
                if(second.next == null){
                    first.next = second.next;
                    return dummy.next;
                }
            }
            first.next = second.next;
            second = first.next;
            
        }
        return dummy.next;
        
    }
}
