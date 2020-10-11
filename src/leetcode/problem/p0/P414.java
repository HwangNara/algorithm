package leetcode.problem.p0;

import java.util.Arrays;

public class P414 {

  public static void main(String[] args) {
    System.out.println(new P414().thirdMax(new int[]{3, 2, 1}));
    System.out.println(new P414().thirdMax(new int[]{1, 2}));
    System.out.println(new P414().thirdMax(new int[]{2, 2, 3, 1}));
    System.out.println(new P414().thirdMax(new int[]{1, 2, -2147483648}));
  }

  public int thirdMax(int[] nums) {
    Max max = new Max();
    Arrays.stream(nums).forEach(max::calc);
    return max.answer();
  }

  private static class Max {

    private Integer[] max = {null, null, null};


    public void calc(Integer num) {
      if (num.equals(max[0]) || num.equals(max[1]) || num.equals(max[2])) {
        return;
      }
      if (max[0] == null) {
        max[0] = num;
      } else if (num > max[0]) {
        swap(1, 2);
        swap(0, 1);
        max[0] = num;
      } else if (max[1] == null) {
        max[1] = num;
      } else if (num > max[1]) {
        swap(1, 2);
        max[1] = num;
      } else if (max[2] == null) {
        max[2] = num;
      } else if (num > max[2]) {
        max[2] = num;
      }

    }

    private void swap(Integer n1, Integer n2) {
      Integer temp = max[n1];
      max[n1] = max[n2];
      max[n2] = temp;
    }

    public int answer() {
      if (max[0] != null && max[1] != null && max[2] != null) {
        return max[2];
      }
      return max[0];
    }
  }
}
