package RevisionLL;

// Q21
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null)
      return head;

    LisNode mid = getMid(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);

    return merge(left, right);

  }

  public ListNode merge(ListNode list1, ListNode list2) {

    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;

    ListNode newNode = new ListNode(0);
    ListNode currNode = newNode;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        currNode.next = list1;
        list1 = list1.next;
      } else {
        currNode.next = list2;
        list2 = list2.next;
      }

      currNode = currNode.next;
    }

    if (list1 == null) {
      currNode.next = list2;
    }

    if (list2 == null) {
      currNode.next = list1;
    }

    return newNode.next;
  }
}