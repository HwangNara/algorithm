package leetcode.problem.p0;

public class P628 {

  public static void main(String[] args) {
    System.out.println(new P628().maximumProduct(new int[]{-1, -2, -1000, -4}));
    System.out.println(new P628().maximumProduct(new int[]{1, -2, -3}));
    System.out.println(new P628().maximumProduct(new int[]{1, 2, 3, 4}));
    System.out.println(new P628().maximumProduct(new int[]{1, 2, -3, -4}));
    System.out.println(new P628().maximumProduct(new int[]{1000, 1000, 1000, -4}));
    System.out.println(new P628().maximumProduct(
        new int[]{722, 634, -504, -379, 163, -613, -842, -578, 750, 951, -158, 30, -238, -392, -487,
            -797, -157, -374, 999, -5, -521, -879, -858, 382, 626, 803, -347, 903, -205, 57, -342,
            186, -736, 17, 83, 726, -960, 343, -984, 937, -758, -122, 577, -595, -544, -559, 903,
            -183, 192, 825, 368, -674, 57, -959, 884, 29, -681, -339, 582, 969, -95, -455, -275,
            205, -548, 79, 258, 35, 233, 203, 20, -936, 878, -868, -458, -882, 867, -664, -892,
            -687, 322, 844, -745, 447, -909, -586, 69, -88, 88, 445, -553, -666, 130, -640, -918,
            -7, -420, -368, 250, -786}));
  }

  public int maximumProduct(int[] nums) {
    return Math.max(plusCalc(nums), plus1minus2(nums));
  }

  private int plusCalc(int[] nums) {
    int[] max = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    for (int num : nums) {
      if (num > max[0]) {
        swap(max, 1, 2);
        swap(max, 0, 1);
        max[0] = num;
      } else if (num > max[1]) {
        swap(max, 1, 2);
        max[1] = num;
      } else if (num > max[2]) {
        max[2] = num;
      }
    }
    return max[0] * max[1] * max[2];
  }

  private int plus1minus2(int[] nums) {
    int max = Integer.MIN_VALUE;
    int[] mins = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    for (int num : nums) {
      if (num > 0 && num > max) {
        max = num;
      } else if (num < mins[0]) {
        swap(mins, 0, 1);
        mins[0] = num;
      } else if (num < mins[1]) {
        mins[1] = num;
      }
    }
    return max == Integer.MIN_VALUE ? max : max * mins[0] * mins[1];
  }

  private void swap(int[] max, int n1, int n2) {
    int temp = max[n1];
    max[n1] = max[n2];
    max[n2] = temp;
  }
}
