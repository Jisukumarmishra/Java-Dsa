public class AdvancedRecursion1 {
     // print all permutation of a String;
 public static void printPermutation(String str , String permutation ) {
    if (str.length() == 0) {
        System.out.println (permutation);
        return;
    }
    for (int i = 0; i<str.length () ;i++ ) {
        char currChar = str.charAt(i); // character nikate hai 
        String newStr = str.substring(0, i) + str.substring(i+1);
        printPermutation ( newStr , permutation + currChar );
      }
    }
public static void main ( String arg []) {
    String str = "abc";
    printPermutation(str, "");
}

} // time complexity is 0(n!)


