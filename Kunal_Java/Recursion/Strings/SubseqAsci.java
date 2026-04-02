package Strings;

import java.util.ArrayList;

public class SubseqAsci {
  public static void main(String[] args) {
    // char ch = 'a';
    // System.out.println(ch+0);
    // System.out.println((char)(ch+1));

    // subseqAsci("", "abc");
    System.out.println(subSeqAsciRet("", "abc"));

  }

  static void subseqAsci (String p, String up ) {
    if (up.isEmpty()) {
      System.out.println(p);
      return ;

    }

    char ch = up.charAt(0);
    subseqAsci(p + ch, up.substring(1));
    subseqAsci(p, up.substring(1));
    subseqAsci(p + (ch + 0), up.substring(1));
  }

  static ArrayList<String> subSeqAsciRet (String p, String up ) {
    if (up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;

    }

    char ch = up.charAt(0);
    ArrayList<String> first = subSeqAsciRet(p + ch , up.substring(1));
    ArrayList<String> second = subSeqAsciRet(p, up.substring(1));
    ArrayList<String> third = subSeqAsciRet(p+(ch+0), up.substring(1));

    first.addAll(second);
    first.addAll(third);

    return first;
  }
}
