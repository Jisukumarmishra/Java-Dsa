import java.util.ArrayList;

public class preetyPrinting {
  public static void main(String[] args) {
      float a  = 453.1874f;
      // System.out.printf("Formatted number is %.2f", a);

      // System.out.println(Math.PI);

      // System.out.printf("pie: %.3f", Math.PI); // %.3f is a formate specifier

      // System.out.printf("Hellow My Name is %s and I am %s", "Jisu", "Cool");
       System.out.println("jisu" + new  ArrayList<>());
       System.out.println("jisu" + new Integer(56));

       String ans = new Integer(63) + "" + new ArrayList<>(); // atleaset of of the expression is the string then its work
       // because one of the string then the whole overall expression is the string
       System.out.println(ans);
  }
}
