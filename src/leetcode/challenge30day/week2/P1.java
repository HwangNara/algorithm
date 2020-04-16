package leetcode.challenge30day.week2;

public class P1 {

  public static void main(String[] args) {
    ListNode input1 = new ListNode(1);
    ListNode input2 = new ListNode(2);
    ListNode input3 = new ListNode(3);
    ListNode input4 = new ListNode(4);
    ListNode input5 = new ListNode(5);
    input1.next = input2;
    input2.next = input3;
    input3.next = input4;
    input4.next = input5;
    System.out.println(new P1().middleNode(input1));
  }

  public ListNode middleNode(ListNode head) {
    int length = 0;
    ListNode dummy = head;
    while (dummy != null) {
      length++;
      dummy = dummy.next;
    }
    length /= 2;
    int count = -1;
    while (true) {
      count++;
      if (count == length) {
        return head;
      }
      head = head.next;
    }
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
