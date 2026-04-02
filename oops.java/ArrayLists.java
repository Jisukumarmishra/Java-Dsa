import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<Integer>();
    // add element
    List.add(0);
    List.add(2);
    List.add(3);
    System.out.println(List);

    // get element //particular ele3ment ko selecvt karne me
    int element = List.get(0);
    System.out.println(element);

    // to add element in between
    List.add(1, 1); // pahla val 1 index hai and dusra vala 1add karna hai
    System.out.println(List);

    // set element
    List.set(0, 5); // replace kar denge 0 index pr vale number ko
    System.out.println(List);

    // delete element
    List.remove(3);
    System.out.println(List);

    // size
    int size = List.size();
    System.out.println(size);
    // loops (for loops)
    for (int i = 0; i < List.size(); i++) {
      System.out.println(List.get(i));
    }

    // sorting
    Collections.sort(List);
    System.out.println(List);

  }
}