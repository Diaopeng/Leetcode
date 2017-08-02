/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0);
        ListNode former = result;
        result.next = head;
        while(head!= null){
            if(head.val == val){ 
                former.next = head.next;
                head = former.next;
            }
            else{
                former = former.next;
                head = head.next;
            }
        }
        return result.next;
    }
}
