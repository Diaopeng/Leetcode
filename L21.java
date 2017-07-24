
/*
这是第一道有关链表的题目，这个题目的核心主要是递归的合并两个链表.
链表是一种非常特殊的数据结构
插入数据时候不需要大批量的搬移
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode merge;
        if(l1.val > l2.val){
            merge = l2;
            merge.next = mergeTwoLists(l1, l2.next);
        }
        else{
            merge = l1;
            merge.next = mergeTwoLists(l1.next, l2);
        }   
        return merge;
    }
}
