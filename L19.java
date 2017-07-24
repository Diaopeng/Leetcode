


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//这种做法是two pass的做法，第一次统计整个的链表的长度，第二次找到对应的位置，删除该节点
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head,p2 = head;
        int length = 1;
        while(p1.next != null){
            p1 = p1.next;
            length++;
        }
        p1 = head;
        while(length != n && p1.next != null){
            p2 = p1;
            p1 = p1.next;
            length--;
        }
        if(p1 == head)
            head = head.next;
        else
            p2.next = p1.next;
        return head;
    }
}
//one pass的做法主要是使用两个pointers 互相间隔n+1

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode fast = start, slow = start;
        start.next = head;
        for(int i = 0;i <= n;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
