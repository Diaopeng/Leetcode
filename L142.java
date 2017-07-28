/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//仍然是使用hashset的方法来进行判断
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> s = new HashSet<ListNode>();
        while(head != null){
            if(s.contains(head))
                return head;
            else
                s.add(head);
            head = head.next;
        }
        return null;
        
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head, start = head;
        if(head == null || head.next == null)
            return null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(slow != start){
                    slow = slow.next;
                    start = start.next;
                }
                return start;
            }
        }
        return null;
        
    }
}
