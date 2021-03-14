package leetcode.problem.p0;

public class P61 {

  public static void main(String[] args) {
    ListNode head2 = new ListNode(2, null);
    ListNode head1 = new ListNode(1, head2);
    ListNode head0 = new ListNode(0, head1);
    int k = 4;

    System.out.println(new P61().rotateRight(head0, k));
  }

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null) {
      return head;
    }

    // find length, k. O(n)
    int length = 1;
    ListNode originHead = head;
    while (head.next != null) {
      length++;
      head = head.next;
    }
    head.next = originHead;
    head = head.next;
    k = length - (k % length);

    // move head k-th. O(n)
    for (int i = 0; i < k; i++) {
      head = head.next;
    }
    ListNode answer = head;

    // set null last node. O(n)
    while (head != null) {
      if (head.next == answer) {
        head.next = null;
      }
      head = head.next;
    }
    return answer;
  }


  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return "ListNode{" +
          "val=" + val +
//          ", next=" + next +
          '}';
    }
  }
}
