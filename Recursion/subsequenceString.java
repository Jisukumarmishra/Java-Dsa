public class subsequenceString { // print all the subsequence of a string
    // that mens har ek element ke pass do choice hoga with respective manner;
    // isme do call function call karte hai;
    public static void printSubseq (String str,int idx,String res) {
        if (idx == str.length()) {
            System.out.println(res);
            return;
        } 
        //choose
        printSubseq(str, idx+1, res+str.charAt(idx));
        //dont choose
        printSubseq(str, idx+1, res);

    }
    public static void main (String arg[]) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str1, 0, "");
        printSubseq(str2, 0, "");
    }
} // tinme complexity is O(2^n)
