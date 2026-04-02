public class keypadCombination {// print all keypad combination -> "23"
    public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno","pqrs", "tu", "vwx", "yz" } ;// creating   keypad using array
    public static void printComb ( String str ,int idx, String combination ) {
      if (idx == str.length()){
        System.out.println(combination);
        return;
      }
        char currChar = str.charAt(idx);  // current character nikalte hai
        String mapping = keypad[currChar - '0'];// kepad me current chartacter vale index pe kya store hai
        for (int i = 0; i<mapping.length(); i++ ) {
         printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "2";
        printComb(str, 0, "");// combination ke liye empty string pass kiye hai
        
    }
}
