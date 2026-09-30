/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

import java.util.*;

class Solution {
  public ArrayList<Integer> levelOrder(Node root) {
    // code here
    ArrayList<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {

      int levelSize = q.size();

      for (int i = 0; i < levelSize; i++) {

        Node currNode = q.poll();

        result.add(currNode.data);

        if (currNode.left != null) {
          q.add(currNode.left);
        }

        if (currNode.right != null) {
          q.add(currNode.right);
        }

      }

    }

    return result;
  }
}