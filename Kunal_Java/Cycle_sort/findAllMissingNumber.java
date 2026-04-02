package Cycle_sort;

import java.util.ArrayList;

public class findAllMissingNumber {
  // google question (448) [1 to n]
  public static void main(String[] args) {
    int [] nums =  {4, 3, 2, 7, 8, 2, 3, 1};
    System.out.println(allmissingNumber(nums));
     
  }

  public static ArrayList<Integer> allmissingNumber (int [] nums ) {
    int i =0; 
    while ( i < nums.length ) {

      int correctIndex = nums[i] - 1;
      if(nums[i] >=1 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) { //nums[i] >=1 && nums[i] <= nums.length this is the condation for the boundary check
        swapped (nums, i, correctIndex);

      } else {
        i ++;
      }
    }

    ArrayList<Integer> ans = new ArrayList<>();
    
    
    // just find the missing number
    for ( int index= 0; index < nums.length; index++) {
      if (nums[index] !=  index +1 ) { // because we comapre only value/ element to value/ element and index = value -1 ;
      ans.add(index +1);
      }
    }
    return ans;
    
  }

  public static void swapped (int nums[], int start, int end ) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
  }

}
