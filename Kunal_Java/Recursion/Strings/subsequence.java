package Strings;

import java.util.ArrayList;

public class subsequence {
  public static void main(String[] args) {
    subseq("", "abc");
    // subsequence me order matter karyta hai 
    System.out.println(subsequRet("", "abc"));
  }

  static void subseq(String p, String up) {

    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }

    char ch = up.charAt(0); // take the first character and make two recursive call

    subseq(p + ch, up.substring(1)); // either add it // its creating a new object in the parameter //.substrinng not changing the  up its creating a new one 
    subseq(p, up.substring(1)); // or ignore it

  }

  static ArrayList<String> subsequRet(String p, String up ) {
    if (up.isEmpty()) {
    ArrayList<String> list = new ArrayList<>();
    list.add(p);
    return list;

    }

   char ch = up.charAt(0);
   ArrayList left = subsequRet(p+ch, up.substring(1));
   ArrayList right = subsequRet(p, up.substring(1));

   left.addAll(right);
   return left;

  }

}
