package SearchingKunal;
import java.util.Arrays;


public class searchingIN2dArrays {
 public static void main(String[] args) {
     int[][] arr = {
      {23,4,1},
      {18,19,3,9},
      {78,99,34,56},
      {18,12}
     };
     int target = 56;
     int[] ans = search(arr,target);//formate of return value { row, col}
     System.out.print(Arrays.toString(ans));
    }

    static int [] search ( int[][] arr, int target) {
     for(int row=0; row<arr.length;row++){
      for(int col=0; col<arr[row].length;col++){
        if(arr[row][col] == target) {
          return new int[] {row, col};
        }
      }
     }
     return new int[] {-1,-1};
    }
}
