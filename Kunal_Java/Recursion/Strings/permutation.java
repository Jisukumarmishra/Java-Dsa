package Strings;
import java.util.ArrayList;

public class permutation {
  public static void main(String[] args) {
    // perm("", "abc");

    // ArrayList<String> ans = permuList("", "abc");
    // System.out.println(ans);
    System.out.println(permutationCount("", "abcd"));

  }

  static void perm (String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return ;
    }

    char ch = up.charAt(0);

    //since varriable number of function call in each call show we 
    for(int i=0; i<=p.length(); i++) {
      String f = p.substring(0,i); 
      String s = p.substring(i,p.length());
      perm(f+ch+s, up.substring(1));
    }
  }
    
  static ArrayList<String> permuList (String p, String up) {

    if (up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    char ch = up.charAt(0);
    
     // all the answer is stored inans list 
    ArrayList<String> ans = new ArrayList<>();
     
    for( int i=0; i<=p.length(); i++) {
      String f = p.substring(0,i);
      String s = p.substring(i,p.length());
      ans.addAll(permuList(f+ch+s, up.substring(1)));

    }
    return ans;

  }
    
  static int permutationCount (String p, String up) {
    if (up.isEmpty()) {
      return 1 ;
    }
    int count =0;
    char ch = up.charAt(0);

    //since varriable number of function call in each call show we 
    for(int i=0; i<=p.length(); i++) {
      String f = p.substring(0,i); 
      String s = p.substring(i,p.length());
      count = count + permutationCount(f+ch+s, up.substring(1));

    }
    return count;
 }
}
