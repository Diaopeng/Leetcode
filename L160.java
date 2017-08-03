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
        HashSet<ListNode> list = new HashSet<ListNode>();
        while(headA != null){
            list.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(list.contains(headB))
                return headB;
            else
                headB = headB.next;
        }
        return null;
    }
}

//we can still optimize it to O(1) time complexity

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode a = headA, b = headB;
        while(a != b){
            a = (a == null)? headB:a.next;
            b = (b == null)? headA:b.next;
        }
        return a;
    }
}
