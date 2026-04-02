public class LL {
    Node head;
    // for tracking size
    private int size;

    // constructor bna rhe hai
    LL() {
        this.size = 0;

    }

    class Node { // box bna rhe hai linked List ka jisme store karenge data
        String data;
        Node next; // node me hamlog data and next store kra rhe hai //jisme next ka type Node hai
                   // isliy uske pahle hamne node likha hai

        // node ka constructor

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // traverse karenge LL ko
        Node currNode = head; // curr node create kiye jisko head ki value assign kar diye
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // ab last node pe pachunge node ko traverse karte hue to
        currNode.next = newNode;

    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first node of LL
    public void deleteFirst() {
        // corner case
        if (head == null) {
            System.out.println("this List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("this List is Empty");
            return;
        }
        size--; // size -- ko ham nichle vale if se niche nhi likh sakte agr Likh diye to niche
                // vali if condition ko hamlog miss kar
        // single node hai
        if (head.next == null) {
            head = null;
            return;
        }

        // traverse karna parega
        Node secondLast = head;
        Node LastNode = head.next;
        while (LastNode.next != null) { // if head.next = null then LastNode.next =
            LastNode = LastNode.next; // then also null.next also null so here come to error so we add one corner case
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() { // fubnction me void ke jagahe pe hamne int likha hai because vahe value return
                           // karega
        return size;
    }

    public static void main(String[] args) {
        LL List = new LL();
        List.addFirst("a");
        List.addFirst("is");
        List.printList();

        List.addLast("list");
        List.printList();

        List.addFirst("this");
        List.printList();

        List.deleteFirst();
        List.printList();

        List.deleteFirst();
        List.printList();

        System.out.println(List.getSize());
        List.addFirst("This");
        List.printList();
        System.out.println(List.getSize());
    }
} // 4 basicv operation on ll
  // add, print,delete,size
