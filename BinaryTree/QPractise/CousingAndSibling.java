public class CousingAndSibling {
  class Node {
    Node left;
    Node right;
    int val;
  }

  // findNode That Find The Nodes In Binay Tree

  Node findNode(Node node, int x) {
    if (node == null)
      return null;
    if (node.val == x)
      return node;

    Node n = findNode(node.left, x);
    if (n != null) {
      return n;
    }

    return findNode(node.right, x);
  }

  boolean isCousins(Node root, int x, int y) {
    // if(root == null) return false;
    Node xx = findNode(root, x);
    Node yy = findNode(root, y);

    return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, x, y)));
  }

  boolean isSibling(Node node, int x, int y) {
    if (node == null)
      return false;

    return ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)
        || isSibling(node.left, x, y) || isSibling(node.right, x, y));

  }

  int level(Node node, Node x, int lev) {
    if (node == null)
      return 0;
    if (node == x)
      return lev;

    int l = level(node.left, x, lev + 1);
    if (l != 0) {
      return l;
    }

    return level(node.right, x, lev + 1);

  }

}
