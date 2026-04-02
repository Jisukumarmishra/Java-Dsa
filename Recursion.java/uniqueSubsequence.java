import java.util.HashSet;
public class uniqueSubsequence { // print all unique subsequence of a string;
    public static void printUniquesubsequence ( String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)){
                return;
        } else {
            System.out.println(newString);
            set.add(newString);
            return;
        }

    }
    char currChar = str.charAt(idx);
    // to be
    printUniquesubsequence(str, idx+1, newString+currChar, set);
    // or not to be
    printUniquesubsequence(str, idx+1, newString, set);
}
public static void main(String[] args) {
        String str = "aaa";
     HashSet<String>set = new HashSet<>();
     printUniquesubsequence(str, 0, "", set);
    }
}