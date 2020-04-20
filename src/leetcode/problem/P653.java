package leetcode.problem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class P653 {

  public static void main(String[] args) {
//    TreeNode root = new TreeNode(5);
//    TreeNode n2 = new TreeNode(2);
//    TreeNode n3 = new TreeNode(3);
//    TreeNode n4 = new TreeNode(4);
//    TreeNode n6 = new TreeNode(6);
//    TreeNode n7 = new TreeNode(7);
//    root.left = n3;
//    root.right = n6;
//    n3.left = n2;
//    n3.right = n4;
//    n6.right = n7;
//    int k = 9;

    TreeNode root = new TreeNode(1);
    int k = 2;
    System.out.println(new P653().findTarget(root, k));
  }

  //         5
//          / \
//         3   6
//        / \   \
//       2   4   7
  public boolean findTarget(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    Set<Integer> nums = new HashSet<>();
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
      TreeNode x = q.poll();
      if (x != null) {
        if (nums.contains(k - x.val)) {
          return true;
        }
        nums.add(x.val);
        q.offer(x.left);
        q.offer(x.right);
      }
    }
    return false;
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
