import java.util.Arrays;

public class InsertionK {
  public static void main(String[] args) {
    int [] nums = {- 5 , -6, -90 ,0 } ;
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
      
  }  

  public static void insertionSort (int [] nums ) {
    for (int i=0; i<nums.length-1; i++) {
      for(int j = i+ 1; j > 0; j--) {
        if (nums[j] < nums[j-1]) { 
          int temp = nums[j]; // here we also creating a swap function and using a call a function direct just like in the last searching algo.
          nums[j] = nums[j - 1];
          nums[j - 1] = temp;
        } else {
          break;
        }
      }
    }

  }
}
