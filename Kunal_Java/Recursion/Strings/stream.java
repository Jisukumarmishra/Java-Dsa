package Strings;

public class stream {
  public static void main(String[] args) {

    skip("", "abcdefghaaaaaaijklmanopaaqrstuvaaa");

    System.out.println(skipAppnotApple("abcdefappgh"));
  }

  static void skip(String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return;

    }
    char ch = up.charAt(0);

    if (ch == 'a') {
      // skip it
      skip(p, up.substring(1));// substring creating a new object and removing the first character S
    } else {
      // dont skip it
      skip(p + ch, up.substring(1)); // p + ch → processed string me current character add karta hai

    }
  }

  // returning a string

  static String skip(String up) {
    if (up.isEmpty()) {
      return "";
    }

    char ch = up.charAt(0);

    if (ch == 'a') {
      return skip(up.substring(1)); // Recursion → string chhoti hoti hai
    } else {
      return ch + skip(up.substring(1));
    }
  }

  static String skipApple(String up) {
    if (up.isEmpty()) {
      return "";
    }

    if (up.startsWith("apple")) {
      return skipApple(up.substring(5));

    } else {

      return up.charAt(0) + skipApple(up.substring(1));
    }
  }

  // only skip a app when its not eual to apple

  static String skipAppnotApple(String up) {
    if (up.isEmpty()) {
      return "";
    }

    if (up.startsWith("app") && !up.startsWith("apple")) {
      return skipAppnotApple(up.substring(3));
    } else {
      return up.charAt(0) + skipAppnotApple(up.substring(1));
    }
  }

}
