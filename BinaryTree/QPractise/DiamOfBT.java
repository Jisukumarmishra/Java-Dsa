public class DiamOfBT {
  class Node {
    int val;
    Node left;
    Node right;
  }

  int diameter = 0;

  public int diameterOfBinaryTree(Node root) {
    height(root);
    return diameter;
  }

  int height(Node node) {
    if (node == null)
      return 0;

    int leftHeight = height(node.left);
    int rightHeight = height(node.right);

    int dia = leftHeight + rightHeight + 1; // calculate diameter for every node
    diameter = Math.max(dia, diameter); // updating overall diamter

    return Math.max(leftHeight, rightHeight) + 1;
  }

  // or
  int heightSecondWayToWriting(Node root) {
    if (root == null)
      return 0;

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    // Diameter passing through current node
    diameter = Math.max(diameter, leftHeight + rightHeight);

    // Height of current node
    return Math.max(leftHeight, rightHeight) + 1;
  }
}
