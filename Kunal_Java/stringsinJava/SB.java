public class SB {
  public static void main(String[] args) {
      StringBuilder builder = new StringBuilder();
     for ( int i =0; i<26; i++) {
      char ch = (char) ('a' + i);
      builder.append(ch); // its not creating a new object its only checking Stringbuilder object
     }
    System.out.println(builder.toString());

    builder.reverse();
    System.out.println(builder);

  }
}
