public class reverseLLrecursiveway {
    Node head;
    //for tracking size
    private int size;

    //constructor bna rhe hai
     reverseLLrecursiveway() {
        this.size = 0;

    }

    class Node { // box bna rhe hai linked List ka jisme store karenge data
     int data;
     Node next; //node me hamlog data and next store kra rhe hai //jisme next ka type Node hai isliy uske pahle hamne node likha hai 
    //node ka constructor
    Node (int data) {
        this.data = data;
        this.next = null;
        size++;
    }
}
    //add - first, last 
    public void addFirst (int data ) {
        Node newNode = new Node (data);
        if (head == null ) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node (data);
        if (head == null ) {
            head = newNode;
            return;
        }
        // traverse karenge LL ko
        Node currNode = head; //new node create kiye jisko head ki value assign kar diye
      while (currNode.next != null ) {
        currNode = currNode.next;
      }  
      //ab last node pe pachunge node ko traverse karte hue to 
      currNode.next = newNode;
           
    }


    //print
    public void printList () {
        if ( head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode!= null ) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
     // delete first node of LL
     public void deleteFirst () {
        //corner case 
        if ( head == null ) {
            System.out.println("this List is empty");
            return;
        }
         size--;
         head = head.next;
        }



        
        //delete last
        public void deleteLast(){
            if (head == null ){
                System.out.println("this List is Empty");
                return;
            }
            size--; // size -- ko ham nichle vale if se niche nhi likh sakte agr Likh diye to niche vali if condition ko hamlog miss kar
            //single node hai
            if ( head.next == null ) {
                head = null;
                return;
            }

            // traverse karna parega
            Node secondLast = head;
            Node LastNode = head.next;
            while (LastNode.next !=null ) { // if head.next = null then LastNode.next =
                LastNode = LastNode.next;   // then also null.next also null so gere come to error so we add one corner case
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
        public int getSize() { // fubnction me void ke jagahe pe hamne int likha hai because vahe value return karega
            return size;

        }
        public Node reverseRecursive (Node head) {
            if (head == null || head.next == null) {
                return head;
            }
           Node newHead = reverseRecursive(head.next);
           head.next.next = head;
           head.next = null;
           return newHead;
        }

        public static void main (String[] args) {
        reverseLLrecursiveway List = new reverseLLrecursiveway();
        List.addLast(1);
        List.addLast(2);
        List.addLast(3);
        List.addLast(4);
        List.printList();

       List.head =  List.reverseRecursive(List.head);
        List.printList();


    }
}

 

