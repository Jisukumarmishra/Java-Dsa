 public class ReverseString {  // print revese of a String
    public static void printRev (String str, int idx ) {
        if ( idx == 0 ) {
            System.out.print(str.charAt(idx));  // base condition hamesha recursive finction ke badh likhna hai
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }
}