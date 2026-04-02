public class comparasionString {
  public static void main(String[] args) {
      String s1 = new String ("Jisu"); // whenever a new keuword use in to creating a ane new object
      String s2 = new String ("Jisu"); // i.e its represent/ point the different refrencevarriable in heap memeory

      if ( s1 == s2 ) {
        System.out.println("equal");
      } else {
        System.out.println("not equal");
      }
  }
}
