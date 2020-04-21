package leetcode.problem.p0;

public class P21 {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l1a = new ListNode(2);
    ListNode l1b = new ListNode(4);
    l1.next = l1a;
    l1a.next = l1b;

    ListNode l2 = new ListNode(1);
    ListNode l2a = new ListNode(3);
    ListNode l2b = new ListNode(4);
    l2.next = l2a;
    l2a.next = l2b;

    new P21().mergeTwoLists(l1, l2);//  Output:1->1->2->3->4->4
  }


  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode ans = dummy;

    while (l1 != null || l2 != null) {
      int v1 = l1 != null ? l1.val : Integer.MAX_VALUE;
      int v2 = l2 != null ? l2.val : Integer.MAX_VALUE;

      if (v1 < v2) {
        dummy.next = l1;
        dummy = dummy.next;
        l1 = l1.next;
      } else if (v1 > v2) {
        dummy.next = l2;
        dummy = dummy.next;
        l2 = l2.next;
      } else {
        dummy.next = l1;
        dummy = dummy.next;
        l1 = l1.next;
        dummy.next = l2;
        dummy = dummy.next;
        l2 = l2.next;
      }
    }

    return ans.next;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
