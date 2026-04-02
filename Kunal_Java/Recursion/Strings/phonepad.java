package Strings;
import java.util.ArrayList;

public class phonepad {
  public static void main(String[] args) {
    phonePad("", "12");
    System.out.println(padRet("", "12").size());
    System.out.println(PadCount("", "12"));
    
  }

  static void phonePad(String p, String up) {
    if (up.isEmpty()) {
     System.out.println(p);
     return ;

    }
   
    int digit = up.charAt(0)-'0'; // this willl convert '2'  into 2

    for ( int i = (digit -1)*3; i<digit*3; i++) {
     
      char ch = (char) ('a' + i); //  a+1 = b, a+4= e

      phonePad(p+ch, up.substring(1));

    }
  }

  static ArrayList<String> padRet(String p, String up) {
    if(up.isEmpty()) {
    ArrayList<String> list = new ArrayList<>();
    list.add(p);
    return list;

    }
    int digit = up.charAt(0) - '0';

    ArrayList<String> list = new ArrayList<>();

    for( int i = (digit-1) * 3 ; i<digit*3; i++) {
      char ch = (char) ('a'+i);
     list.addAll(padRet(p+ch, up.substring(1)));
    }
    return list;
  }

  static int PadCount(String p, String up) {
    if (up.isEmpty()) {
     return 1;
    }

    int count = 0;
    int digit = up.charAt(0)-'0'; // this willl convert '2'  into 2

    for ( int i = (digit -1)*3; i<digit*3; i++) {
     char ch = (char) ('a' + i); //  a+1 = b, a+4= e
    count = count + PadCount(p+ch, up.substring(1));

    }
    return count;
  }

}


// leetcode 17

//  static ArrayList<String> padRet(String p, String up) {
//     if(up.isEmpty()) {
//     ArrayList<String> list = new ArrayList<>();
//     list.add(p);
//     return list;

//     }
//     int digit = up.charAt(0) - '0';

//     ArrayList<String> list = new ArrayList<>();
//     int start = (digit -2) *3;
//     if (digit >7){
//         start++;
//     }

//     int letters =0;

//     if (digit == 7 || digit == 9) {
//         letters = 4;
//     } else {
//         letters = 3;
//     }
//     for( int i = start ; i<start+letters; i++) {
//       char ch = (char) ('a'+i);
//      list.addAll(padRet(p+ch, up.substring(1)));
//     }
//     return list;
//   }

