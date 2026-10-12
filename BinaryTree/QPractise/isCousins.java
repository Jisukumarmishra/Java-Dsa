import java.util.*;

class Solution {
  class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

  }

  public boolean isCousins(TreeNode root, int x, int y) {

    if (root == null)
      return false;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {

      int levelSize = q.size();

      boolean foundX = false;
      boolean foundY = false;

      for (int i = 0; i < levelSize; i++) {

        TreeNode currNode = q.poll();

        // Check if x and y are siblings
        if (currNode.left != null && currNode.right != null) {

          if ((currNode.left.val == x && currNode.right.val == y) ||
              (currNode.left.val == y && currNode.right.val == x)) {

            return false;
          }
        }

        // Check x and y in current level
        if (currNode.val == x) {
          foundX = true;
        }

        if (currNode.val == y) {
          foundY = true;
        }

        // Add children
        if (currNode.left != null) {
          q.add(currNode.left);
        }

        if (currNode.right != null) {
          q.add(currNode.right);
        }
      }

      // Both found at same level and not siblings
      if (foundX && foundY) {
        return true;
      }

      // Only one found at this level
      if (foundX || foundY) {
        return false;
      }
    }

    return false;
  }
}