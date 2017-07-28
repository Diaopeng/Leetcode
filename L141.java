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

//使用hashset的方法判断是否访问过
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set <ListNode> s = new HashSet<ListNode>();
        while(head != null){
            if(s.contains(head))
                return true;
            else
                s.add(head);
            head = head.next;
        }
        return false;
    }
}
//以一种跑步的方式判断两个指针是否回相遇
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast = head.next, slow = head;
        while(fast != slow){
            if(fast == null || fast.next == null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
