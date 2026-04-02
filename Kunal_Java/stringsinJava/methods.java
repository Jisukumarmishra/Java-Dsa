import java.util.Arrays;

public class methods {
  public static void main(String[] args) {
     String name = "Jisu Mishra";
     System.out.println(Arrays.toString(name.toCharArray()));
     System.out.println(name.toLowerCase()); // this create a new object
     System.out.println(name);
     System.out.println(name.indexOf('a'));
     System.out.println("   Jisu    ".strip());
     System.out.println(Arrays.toString(name.split(" ")));
    
  } 
}
