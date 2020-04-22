package leetcode.problem.p0;

import java.util.Stack;

public class P530 {

  public static void main(String[] args) {
    /**
     *            0
     *               2236
     *           1277     2776
     *       519
     */
    TreeNode input = new TreeNode(0);
    TreeNode r1 = new TreeNode(2236);
    TreeNode l2 = new TreeNode(1277);
    TreeNode r2 = new TreeNode(2776);
    TreeNode l3 = new TreeNode(519);
    input.right = r1;
    r1.left = l2;
    r1.right = r2;
    l2.left = l3;

//    TreeNode input = new TreeNode(1);
//    TreeNode r1 = new TreeNode(3);
//    TreeNode l2 = new TreeNode(2);
//    input.right = r1;
//    r1.left = l2;

    System.out.println(new P530().getMinimumDifference(input));
  }

  public int getMinimumDifference(TreeNode root) {
    int min = Integer.MAX_VALUE;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    TreeNode pre = null;
    while (cur != null || !stack.isEmpty()) {
      if (cur != null) {
        stack.push(cur);
        cur = cur.left;
        continue;
      }
      cur = stack.pop();
      if (pre != null) {
        min = Math.min(min, cur.val - pre.val);
      }
      pre = cur;
      cur = cur.right;
    }
    return min;
  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
