package RevisionLL;

import RevisionLL.BubbleSort.Node;

public class reverseLL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
        this.size = 0;
    }

  private class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
  // recursive way

  private void reverse(Node node) {
    if (node == tail) {
      head = tail;
      return;
    }

    reverse(node.next);

    tail.next = node;
    tail = node;
    tail.next = null;
  }

  // in place reversal of LL

}
