package SearchingKunal;
public class split_Array_Largest_sum {
  public static void main(String[] args) {
      
  }

  public int splitArray (int[] nums, int m) {
    int start =0;
    int end =0;

    for(int i=0;i<nums.length; i++) {
      start = Math.max(start,nums[i]); // in the end of the loop this will contains the max item from the array 
      end += nums[i];
    }
    // apply binay search 

    while (start< end ) {
      // try for the middle as potential ans
      int mid = start + (end - start) / 2;
      
     // calculate how many piece you can divide this in with this max sum

     int sum =0;
     int pieces = 1;
     for(int num : nums ) {
      if (sum + num > mid ) {
        // you cannot add this in this sub array, make new one
        // say you add this num in new sub array

        sum = num;
        pieces++;
      } else {
        sum += num;
      }
     }
     if (pieces > m ) {
      start = mid +1;
     } else {
      end = mid;
     }

    }

    return end ; // here start = end 
  }
  
}
