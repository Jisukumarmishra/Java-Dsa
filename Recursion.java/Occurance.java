public class Occurance { // print ist and 2nd occurance of a string
    public static int first = -1;
    public static int last  = -1;

    public static void find0occurance ( String str, int idx, char element ) {
        if( idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if ( currChar  == element ) {
            if ( first == -1 ) {
                first =  idx ;
            } else {
                last = idx ;
            }
        }
        find0occurance ( str, idx + 1 , element );
    }
public static void main(String[] args) {
    String str = "abaacdaefaah";
    find0occurance(str, 0, 'a');
}
}
