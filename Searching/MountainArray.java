package SearchingKunal;
public class MountainArray {
  public static void main(String[] args) {
    int [] array = { 1,3,5,6,5,3,1};

  int peakIndex = peakIndexMountainArray (array);
  System.out.println("peak index is: " + peakIndex);
  System.out.println("peak element is :" + array[peakIndex]);

      
  }

  public static  int peakIndexMountainArray (int[] arr ) {
    int start =0;
    int end = arr.length-1;

    while (start < end ) {
      int mid = start + (end - start ) / 2;
      if(arr[mid] > arr[mid+1]) {
        // you are in the dec. part of the array
        //this may be the answer but look at the left
        // this is why end != mid-1 ;
        end =mid;
      } else {
        start = mid +1; // because we know that mid +1 element > mid element
      }
    }
    return start; //or end because at that  time both are equal
  }
}
