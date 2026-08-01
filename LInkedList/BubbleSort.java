public class BubbleSort {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  static Node head;

  static void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = newNode;
  }

  // Count nodes
  static int size() {
    int count = 0;
    Node temp = head;

    while (temp != null) {
      count++;
      temp = temp.next;
    }

    return count;
  }

  // Bubble Sort
  static void bubbleSort() {

    int n = size();

    for (int i = 0; i < n - 1; i++) {

      Node curr = head;

      for (int j = 0; j < n - i - 1; j++) {

        if (curr.data > curr.next.data) {

          int temp = curr.data;
          curr.data = curr.next.data;
          curr.next.data = temp;
        }

        curr = curr.next;
      }
    }
  }

  static void display() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

    System.out.println();
  }

  public static void main(String[] args) {

    insert(5);
    insert(1);
    insert(4);
    insert(2);
    insert(8);

    System.out.println("Before Sorting:");
    display();

    bubbleSort();

    System.out.println("After Sorting:");
    display();
  }
}