import java.util.Arrays;

public class SelectionK {
  public static void main(String[] args) {
    int [] arr = {-1 , -5, 0, 1 , 2 ,3 };
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
      
  }
  static void selectionSort (int [] arr ) {
    for(int i=0;i<arr.length-1; i++) {
      // find the max item in the remaining array and swap with correct index
      int last = arr.length - i-1; // if we want to remove i from here then we can remove this code run perfectly but it getting 
      // more comparaion i indicated how many elelemnt are sorted thar remove extra comparaion
      int maxIndex = getMaxIndex(arr, 0, last);
      swapped(arr, maxIndex, last);
    
    }
  }
  // to getting the maximum element of the array in each step 
  private static int getMaxIndex(int[] arr, int start, int last) {
   int max =  start;
   for(int i=start; i<=last; i++) {
    if(arr[max] < arr[i]) {
      max = i;
    }

   }

   return max ;
  }
  static void swapped (int [] arr , int first, int second ) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
