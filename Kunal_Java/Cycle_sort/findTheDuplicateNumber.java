package Cycle_sort;
public class findTheDuplicateNumber {
  // 287
  public static void main(String[] args) {
     int [] nums = {1, 3, 4, 2, 2 };
     System.out.println(duplicateNumber(nums)); 
  }
  public static int duplicateNumber (int [] nums) {
    int i=0; 
    while (i < nums.length ) {
      if ( nums[i] != i+1 ) {
        int correctIndex = nums[i] - 1;
        if( nums[i] !=nums[correctIndex]) {
          swapped (nums, i, correctIndex);
        } else {
        return nums[i];

        }
      } else {
      i++;
      }
    }
    return -1;
  }
  public static void swapped (int[] nums, int start, int end ) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
  }
}
