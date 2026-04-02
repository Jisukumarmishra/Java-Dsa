import java.util.Arrays;
public class Main {
        public static void main(String[] args) {
            int [] ages = new int [4];
            ages[1] = 24;
            ages[0] = 42;
            ages[2] = 21;
            ages[3] = 2;
            System.out.println(ages[0]);
            Arrays.sort(ages);
            System.out.println(ages[0]);
        }
}
