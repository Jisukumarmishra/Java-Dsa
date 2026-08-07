/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        
        if(head == null || head.next == null) {
            return true ;
        }
        Node currHead = head ;
        Node mid = getMid(head);
        
        
        // now reverse teh second half
        Node secondHead = reverse(mid);
        
        
        // now compare
        
        while (currHead != null && secondHead != null ) {
            if (currHead.data != secondHead.data) {
                return false ;
            }
            
            currHead = currHead.next;
            secondHead = secondHead.next;
        }
        
        return true;
        
        
        
    }
    
    public Node reverse(Node head) {
        Node prev = null ;
        Node curr = head ;
        Node next = curr.next ;
        
        while (curr != null) {
            curr.next = prev ;
            prev = curr ;
            curr = next;
            
            if(next != null) {
            next = next.next ;
            }
        }
        
        return prev ;
    }
    
    public Node getMid(Node head) {
        Node s = head ;
        Node f = head ;
        
        while(f != null && f.next != null) {
            s = s.next ;
            f = f.next.next ;
        }
        
        return s ;
    }
    
}