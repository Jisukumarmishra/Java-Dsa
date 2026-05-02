package StackConcepts;
import java.util.*;
// code to revese a stack

public class stackProblem2 {
    public static void pushAtButtom(Stack<Integer> s, int data ) {
        if(s.isEmpty()) {
         s.push(data);
         return;
        } 
        int top = s.pop();
        pushAtButtom(s, data);
        s.push(top);
    }
       public static void reverse (Stack<Integer> s) {

        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtButtom(s, top);
       }

    
    public static void main(String[] args) {

    
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    reverse(s);

    while (!s.isEmpty()) {
        System.out.println(s.pop());
    
    }
}

}
