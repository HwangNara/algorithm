package leetcode.problem.p1000;

public class P1539 {

  public static void main(String[] args) {
//    int[] arr = {1,2,3,4};
    int[] arr = {3, 10};
//    int[] arr = {2, 3, 4, 7, 11};
//    int k = 2;
    int k = 2;
//    int k = 5;
    System.out.println(new P1539().findKthPositive(arr, k));
  }

  public int findKthPositive(int[] arr, int k) {
    int answer = 0;
    int index = 0;

    label:
    for (int num : arr) {
      while (++answer < num) {
        index++;
        System.out.println("answer: " + answer + ", index: " + index + ", num: " + num);
        if (index == k) {
          break label;
        }
      }
    }
    return answer + k - index;
  }
}
/**
 * 2, 3, 4, 7, 11
 * <p>
 * 1, 5, 6, 8, 9, 10, 12, 13, 14 ...
 */
