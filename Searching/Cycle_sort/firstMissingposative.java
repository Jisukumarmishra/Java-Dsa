package Cycle_sort;
public class firstMissingposative {
  //https://leetcode.com/problems/first-missing-positive/
  
  public static void main(String[] args) {
      
  }
   public static int missingNumber(int[] nums) {
    int i = 0;
    while ( i < nums.length ) {
      int correctIndex = nums[i] - 1;
      if ( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex]; //in tyhese three lines we can also use a swapped function like in  the cyclic sort
        nums[correctIndex] = temp;
      } else {
        i++;
      }

    }

      // now search for  the element

      for ( int index = 0;  index< nums.length; index++) {
        if (nums[index] != index + 1) {
          return index +1 ;
        } 
      }
      // case 2
       return nums.length + 1;
    }
}
