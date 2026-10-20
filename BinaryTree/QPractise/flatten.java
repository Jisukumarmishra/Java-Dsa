/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  public void flatten(TreeNode root) {
    // optimized approach
    TreeNode curr = root;
    while (curr != null) {
      if (curr.left != null) {
        // if this condt(above) follow then we are be able to find rightmost
        TreeNode temp = curr.left;
        while (temp.right != null) {
          temp = temp.right;

        }

        temp.right = curr.right;
        curr.right = curr.left;

        curr.left = null;
      }
      curr = curr.right;
    }
  }
}