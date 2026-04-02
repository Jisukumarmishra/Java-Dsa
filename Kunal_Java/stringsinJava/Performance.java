public class Performance {
  public static void main (String[] args ) {
    String series = "";
    for (int  i =0; i< 26; i++) {
      char ch = (char) ('a' + i);
      // System.out.println(ch);
      series = series + ch; // series += ch
      // System.out.println(series);
    }
    System.out.println(series); // its creating new object everytime show the time complexity is O(n^2)
  }
}
