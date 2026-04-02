public class RemoveDublicate {
   public static boolean [] Map = new boolean [26]; // create a array with name map store all alpha ber varriable 
    // now write recursive function
    public static void removeDublicate (String str, int idx, String newString ){
        // base case
        if (idx == str.length() ) {
            System.out.println(newString);
            return;
        }
      char currChar = str.charAt(idx);// calculate current character
      if (Map[currChar - 'a'] == true ) {
        removeDublicate(str, idx+1, newString); // that means new string me add nhi karna hai 
      }else {
        newString += currChar;
        
        Map[currChar-'a'] = true;
        removeDublicate(str,idx+1,newString);

      }
    }
    public static void main(String[] args) {
        String str = "abbcda" ;
        removeDublicate(str, 0, "");

        
    }

}
