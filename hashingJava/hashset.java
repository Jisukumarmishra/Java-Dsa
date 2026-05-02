package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer>  arr = new ArrayList<>();
        set.add(1);  //List.add();
        set.add(2);
        set.add(3);
        set.add(2); // ye valla 2 add nhi hoga because set me hamesha unique value store hoti hai
        set.size();
        System.out.println(set.size());
        //search
        if(set.contains(3)) {
        System.out.println("present");
        }
        if(!set.contains(6)) {
            System.out.println("absent");
        }
        set.remove(2);
       
      //iterator - yha pe special iterartor use karte hai  "it"
      set.add(0);
      Iterator it = set.iterator();
      while(it.hasNext()) {
        System.out.println(it.next()+" ");
      }
      //isEmpty()
      if(!set.isEmpty()) {
        System.out.println("set is not empty");
      }
        
    }
}
