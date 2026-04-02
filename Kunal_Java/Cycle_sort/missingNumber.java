package Cycle_sort;
public class missingNumber {
  // amazon interview question
  public static void main(String[] args) {
    int nums[] = { 4, 0, 1, 2};
    System.out.println(missingNumber(nums));
      
  }

  public static int missingNumber(int[] nums) {
    int i = 0;
    while ( i < nums.length ) {
      int correctIndex = nums[i];
      if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex]; //in tyhese three lines we can also use a swapped function like in  the cyclic sort
        nums[correctIndex] = temp;
      } else {
        i++;
      }

    }

      // now search for  the element

      for ( int index = 0;  index< nums.length; index++) {
        if (nums[index] != index) {
          return index;
        } 
      }
      // case 2
       return nums.length;
    }
   

}
