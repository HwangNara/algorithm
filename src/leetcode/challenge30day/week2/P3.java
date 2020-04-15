package leetcode.challenge30day.week2;

import java.util.PriorityQueue;
import java.util.Stack;

public class P3 {

  public static void main(String[] args) {
    P3 p3 = new P3();
    p3.push(-2);
    p3.push(0);
    p3.push(-3);
    System.out.println(p3.getMin());
    p3.pop();
    System.out.println(p3.top());
    System.out.println(p3.getMin());
  }

  private final Stack<Integer> stack;
  private final PriorityQueue<Integer> queue = new PriorityQueue<>();

  /** initialize your data structure here. */
  public P3() {
    this.stack =  new Stack<>();
  }

  public void push(int x) {
    stack.push(x);
    queue.offer(x);
  }

  public void pop() {
    Integer pop = stack.pop();
    queue.remove(pop);
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return queue.peek();
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */