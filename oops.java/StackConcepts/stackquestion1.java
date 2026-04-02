package StackConcepts;

import java.util.Stack;

//To push an element at the bottom of a stack
public class stackquestion1 {
    public static void pushAtButtom(Stack<Integer> s, int data ) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int temp = s.pop(); //uppar ke element ko nikala
        pushAtButtom(s, data);//recursive call 
        s.push(temp);// wapash dal diya
        
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtButtom(s, 4);

        while (!s.isEmpty()) {
         System.out.println(s.pop());
        }

    }
}
