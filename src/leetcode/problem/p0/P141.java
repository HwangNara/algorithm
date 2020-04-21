package leetcode.problem.p0;

import java.util.HashSet;
import java.util.Set;

public class P141 {

  public static void main(String[] args) {
    ListNode input = new ListNode(5);
    System.out.println(new P141().hasCycle(input));
  }

  public boolean hasCycle(ListNode head) {
    Set<ListNode> set = new HashSet<>();
    while (head != null) {
      if (set.contains(head)) {
        return true;
      }
      set.add(head);
      head = head.next;
    }
    return false;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
