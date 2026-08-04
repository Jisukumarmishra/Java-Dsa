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

  public void reverse() {
    if (size < 2) {
      return;
    }

    // starting state
    Node prev = null;
    Node present = head;
    Node next = present.next;

    // duriung state (traversing)
    while (present != null) {
      present.next = prev; // for each iterations
      prev = present; // prev is move ahead
      present = next; // present is move ahead
      if (next != null) {
        next = next.next; // next is also move ahead
      }
    }
    head = prev;
  }

}

// When prev is last element and present is null, what about next? that is null
// beacuse of tha present will become the null
