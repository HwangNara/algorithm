package leetcode.problem.p0;

public class P617 {

  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    System.out.println(new P617().mergeTrees(node1, node2));
  }

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null) {
      return t2;
    }
    if (t2 == null) {
      return t1;
    }
    t1.val += t2.val;
    t1.left = mergeTrees(t1.left, t2.left);
    t1.right = mergeTrees(t1.right,t2.right);
    return t1;
  }

//  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//    TreeNode root = null;
//    root = makeNode(root, t1, t2);
//    return root;
//  }

  private TreeNode makeNode(TreeNode root, TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return null;
    }

    if (root == null) {
      root =  new TreeNode(getValueOrDefault(t1) + getValueOrDefault(t2));
    }

    root.left = makeNode(root.left, t1 == null ? null : t1.left, t2 == null ? null : t2.left);
    root.right = makeNode(root.right, t1 == null ? null : t1.right, t2 == null ? null : t2.right);

    return root;
  }

  private int getValueOrDefault(TreeNode treeNode) {
    return treeNode == null ? 0 : treeNode.val;
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
