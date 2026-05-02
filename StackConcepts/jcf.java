package StackConcepts;
import java.util.*;

public class jcf {
    // stack using arrayList  using jcf
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();

        }

    }
    
}
