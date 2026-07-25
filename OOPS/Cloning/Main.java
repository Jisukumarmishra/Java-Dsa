package Cloning;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Human jisu = new Human(34, "jisu");

    // Human twin = new Human(kunal);

    Human twin = (Human) jisu.clone();
    System.out.println(twin.age + " " + twin.name);
    System.out.println(Arrays.toString(twin.arr));

    twin.arr[0] = 100;

    System.out.println(Arrays.toString(twin.arr));
    System.out.println(Arrays.toString(jisu.arr));
  }
}
