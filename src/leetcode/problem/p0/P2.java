package leetcode.problem.p0;

public class P2 {

  public static void main(String[] args) {
//    ListNode l2 = new ListNode(3);
//    ListNode l1 = new ListNode(4);
    ListNode left = new ListNode(5);
//    left.next = l1;
//    l1.next = l2;

//    ListNode r2 = new ListNode(4);
//    ListNode r1 = new ListNode(6);
    ListNode right = new ListNode(5);
//    right.next = r1;
//    r1.next = r2;
    ListNode listNode = new P2().addTwoNumbers(left, right);

    while (listNode != null) {
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(-1);
    ListNode cur = head;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int sum = carry;
      sum += l1 != null ? l1.val : 0;
      sum += l2 != null ? l2.val : 0;
      carry = sum / 10;

      cur.next = new ListNode(sum % 10);
      cur = cur.next;

      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }
    if (carry != 0) {
      cur.next = new ListNode(carry);
    }
    return head.next;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}

