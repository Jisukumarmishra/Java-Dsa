import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ZigZagOrderTraversal {

  class Node {
    int data;
    Node left, right;

    Node(int d) {
      data = d;
      left = right = null;
    }
  }

  ArrayList<Integer> zigZagTraversal(Node root) {
    ArrayList<Integer> result = new ArrayList<>();

    Deque<Node> q = new LinkedList<>();
    q.add(root);

    boolean rev = false;

    while (!q.isEmpty()) {
      int levelSize = q.size();
      ArrayList<Integer> currLevel = new ArrayList<>();

      for (int i = 0; i < levelSize; i++) {

        if (!rev) {
          // normal queue adding :-- remove front add back
          Node currNode = q.pollFirst();
          currLevel.addLast(currNode.data);

          if (currNode.left != null) {
            q.addFirst(currNode.left);
          }

          if (currNode.right != null) {
            q.add(currNode.right);
          }

        } else {
          // remove last and add front
          Node currNode = q.pollLast();
          currLevel.add(currNode.data);

          if (currNode.right != null) {
            q.add(currNode.right);
          }

          if (currNode.left != null) {
            q.add(currNode.left);
          }

        }

      }

      // for flipping
      rev = !rev;
      result.addAll(currLevel);

    }

    return result;
  }

  public static void main(String[] args) {

    ZigZagOrderTraversal obj = new ZigZagOrderTraversal();

    Node root = obj.new Node(1);

    root.left = obj.new Node(2);
    root.right = obj.new Node(3);

    root.left.left = obj.new Node(4);
    root.left.right = obj.new Node(5);

    root.right.left = obj.new Node(6);
    root.right.right = obj.new Node(7);

    ArrayList<Integer> ans = obj.zigZagTraversal(root);

    System.out.println(ans);
  }

}

// 1
// / \
// 2 3
// / \ / \
// 4 5 6 7
