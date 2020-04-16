package leetcode.challenge30day.week2;

import java.util.Collections;
import java.util.PriorityQueue;

public class P5 {

  public static void main(String[] args) {
    int[] input = {3}; // 3
//    int[] input = {2, 7, 4, 1, 8, 1}; // 1
    System.out.println(new P5().lastStoneWeight(input));
  }

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    for (int stone : stones) {
      q.add(stone);
    }
    while (q.size() != 1) {
      Integer a = q.poll();
      Integer b = q.poll();
      q.offer(a - b);
    }
    return q.poll();
  }
}
