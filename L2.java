
//problem 2,前面加上一位计算更加的方便
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode iter = result;
        int c = 0;
        while(l1 != null || l2 != null){
            int num1 = (l1 == null)? 0: l1.val;
            int num2 = (l2 == null)? 0: l2.val;
            int sum = num1 + num2 + c;
            iter.next = new ListNode(sum%10);
            c = sum /10;
            iter = iter.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if( c>0)
            iter.next = new ListNode(c);
        return result.next;
    }
}
