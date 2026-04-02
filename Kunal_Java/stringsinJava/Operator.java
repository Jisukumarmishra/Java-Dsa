import java.util.*;
public class Operator {
  public static void main(String[] args) {
      System.out.println('a' + 'b'); // convert character into their asci value and then add this
      System.out.println("a" + "b"); // string are not be converted into asci value its simply conacteinate
      System.out.println('a' + 3);
      System.out.println((char) ('a'+3));
      System.out.println("a" + 3); // this is same as a after a few steps
      // integer will be converted to integer that will toString()

      System.out.println("Jisu" + new ArrayList<>());
  }
}
