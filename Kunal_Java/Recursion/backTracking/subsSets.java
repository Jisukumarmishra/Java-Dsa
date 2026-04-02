package backTracking;
public class subsSets {
  public static void main(String[] args) {
    String s = "abc";
    printSubsets(s,"", 0);
    
  }
  static void printSubsets(String s,String ans,int i) {
    if (i == s.length()){
      if (ans.length() == 0) {
        System.out.println("null");  
      }
      System.out.println(ans);
      return;
    }
    // yes choice
    printSubsets(s, ans+s.charAt(i), i+1);
    //no choice
    printSubsets(s,ans, i+1);
  }
}
