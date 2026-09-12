// bfs level order traversal

package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Bfs
 */
public class Bfs {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();

    if (root == null)
      return ans;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();

      List<Integer> currentLevel = new ArrayList<>(levelSize);

      for (int i = 0; i < levelSize; i++) {
        TreeNode currNode = queue.poll();
        currentLevel.add(currNode.val);

        if (currNode.left != null) {
          queue.offer(currNode.left);
        }

        if (currNode.right != null) {
          queue.offer(currNode.right);
        }

      }

      ans.add(currentLevel);

    }

    return ans;

  }
}