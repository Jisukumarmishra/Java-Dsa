package StackConcepts;
//stack using LL using jcf
import java.util.*;

public class LLusingjcf {
    public static void main(String[] args){


   LinkedList<Integer> s = new LinkedList<>();
   s.addFirst(1);
   s.addFirst(2);
   s.addFirst(3);
   s.addFirst(4);
   while (!s.isEmpty()){
    System.out.println(s.getFirst());//peek
    s.removeFirst();//pop
   }

    }

}
