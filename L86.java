/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//我们使用两个链表分别保存大于和小于x的数字，然后在将两个链表直接连接起来
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode n1 = small, n2 = big;
        while(head != null){
            if(head.val < x)
                n1 = n1.next = head;
            else
                n2 = n2.next = head;
            head = head.next;
        }
        n2.next = null;
        n1.next = big.next;
        return small.next;
    }
}
