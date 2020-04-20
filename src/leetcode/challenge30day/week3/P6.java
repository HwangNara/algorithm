package leetcode.challenge30day.week3;

public class P6 {

  static int count = 0;

  public static void main(String[] args) {
    int[] input = {8, 5, 1, 7, 10, 12};
    TreeNode treeNode = new P6().bstFromPreorder(input);
  }

  public TreeNode bstFromPreorder(int[] preorder) {
    TreeNode root = null;
    for (int i = 0; i < preorder.length; i++) {
      root = dfs(root, preorder[i]);
    }
    return root;
  }

  private TreeNode dfs(TreeNode root, int value) {
    if (root == null) {
      return new TreeNode(value);
    }
    if (root.val > value) {
      root.left = dfs(root.left, value);
    } else {
      root.right = dfs(root.right, value);
    }
    return root;
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
