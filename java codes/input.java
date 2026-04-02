import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner inppt = new Scanner(System.in);
        System.out.println("enter your age : ");
        float age = inppt.nextFloat(); //here we also use boolean,char,String
        System.out.println(age);
        inppt.close();
    }


}

