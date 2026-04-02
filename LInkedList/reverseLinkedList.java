public class reverseLinkedList { // no extra memory to be used that means space complexity is o(1) //iterative way to reverse a LL
  Node head;
   class Node {
    int data ;
    Node next;
    Node (int data ) {
        this.data = data;
        this.next = null;


    }
   }
   public void addLast (int data ) {

    Node newNode = new Node(data);
    if (head == null ) {
        head = newNode;
        return;
    }
    Node current = head;
    while (current.next != null ) {
        current = current.next;
    }
    current.next = newNode;

   }
    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public  void reverseIterate () {

      if ( head == null || head.next == null ) {
            return;
         }
        Node  prevNode = head; // starting from first element from the LL
        Node currNode = head.next;
        while (currNode != null) {
             Node nextNode = currNode.next; //next node define kiye hai 
              currNode.next = prevNode;
              //update 
              prevNode = currNode ; //  prev node me current nnode ki value store kra denge 

              currNode = nextNode ; // matlab same hai prev node kai tarahe isme bhi ab curr nodechange ho jayga 
            
        }
         head.next = null; //starting element head ka ek connection bacha RAH GYA THA ISLIYE USKO NULL KAR DIYE 
        head = prevNode;
    }
  
    public static void main (String args[] ) {
     reverseLinkedList list = new reverseLinkedList();
     list.addLast(1);
     list.addLast(2);
     list.addLast(3);
     list.addLast(4);

        list.reverseIterate ();
        list.printList();
   
    }
}
