public class permutation {
  public static void main(String[] args) {
    String str = "abc";
    printPermutation(str, "");
    
  }

  static void printPermutation (String str, String ans) {
    if (str.length()==0) {
      System.out.println(ans);
      return ;
    }

    for (int i=0; i<str.length(); i++) {
    char curr = str.charAt(i);
    //"abcde" = "ab" + "de"
    String newStr = str.substring(0,i) + str.substring(i+1,str.length());
    printPermutation(newStr, ans+curr);
    }
  }
}
