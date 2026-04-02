import java.util.Arrays;

public class bubblesort {
  public static void main(String[] args) {
    int [] nums = {5, 4, 3, 1, 8};
    BubbleSort(nums);
    System.out.println(Arrays.toString(nums));
      

  }

  static void BubbleSort (int [] nums  ) {
    boolean swapped;
    
    for(int i =0; i<nums.length; i++) {
      swapped = false;
      
      for (int j =1; j<nums.length; j++) {

        if (nums[j] < nums [j-1]) {
          int temp = nums[j];
          nums[j] = nums[j -1];
          nums[j -1 ] = temp ;
          swapped = true; // i.e  till now swapped operation perform or not
          // int temp= nums[j-1];
          // nums[j-1] = nums[j];
          // nums[j] = temp;
        
        }

      }
       // if you did not swap jfor a particular value of i , it means array is sorted hence stop the loop
        if (!swapped) { 
        break;  
      }
    }
   
  
  }
}
