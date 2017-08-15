
//使用插入排序的方法
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode result = new ListNode(0);
        result.next = new ListNode(head.val);
        head = head.next;
        while(head != null){
            ListNode cur = result;
            while(cur.next != null){
                if(head.val <= cur.next.val){
                    ListNode temp = new ListNode(head.val);
                    temp.next = cur.next;
                    cur.next = temp;
                    break;
                }
                else
                    cur = cur.next;
            }
            if(cur.next == null){
                ListNode temp = new ListNode(head.val);
                cur.next = temp;
                temp.next = null;
            }
            head = head.next;
        }
        return result.next;
    }
}
