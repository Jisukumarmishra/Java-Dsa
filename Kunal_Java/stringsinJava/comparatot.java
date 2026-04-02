public class comparatot {
  public static void main(String[] args) {
    String  s1 = "jisu";

    String  s2 = "jisu";

    if ( s1 == s2 ) { // this comparator ( ==) because memru heap me ye dono varriable same object ko point out kar rhe hai 
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }
  }
}
