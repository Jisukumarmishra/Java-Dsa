package Sortings;
import java.util.Arrays;

public class mergesort {
  public static void main(String[] args) {
    int [] arr = { 5, 4, 3, 2 , 1};
     arr = mergeSort(arr);
     
     System.out.println(Arrays.toString(arr));


  }

  static int [] mergeSort (int [] arr) {

    // base case 
    if ( arr.length == 1 ) { //Merge Sort works by breaking arrays until each sub-array has only ONE element show length = 1 not 0

      return arr;
    }
    
    int mid = arr.length / 2 ;

    int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // theses creating new object for every function call
    int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));// that means original array is not modified its create a new sorted array
    // simple means har ek function call  apne individual level pe array return kar rha hai bhale hi vo sinle element ka o ho
    return merge (left, right);


  }

  private static  int[] merge (int[] first, int[] second) {
    int[] mix = new int[first.length + second.length];

    int i=0; // to pointing the elelment of left array
    int j=0; // to pointing the element of right array
    int k=0; // to pointing the element of new array formed left and right array


    // merging the two array
    while (i < first.length && j < second.length ) { // while ke andar true chize likho because jab ye false hoga tab tumhara out of bout error aayega
    
      if (first[i] < second[j] ) {
        mix[k] = first[i];  // jiski value chooti hai usko mix array me put kar rthe hai
        i++;
      } else {
      mix[k] = second[j];
      j++;

      }
      k++;
    
    }

    // it may be possible to one of the array is not complete or first array (left) is big and second array (right )is small and vice-versa
    // then add the remaining array in the mix array;

    while ( i<first.length) {
      mix[k] = first[i];
      i++;
      k++;
    }

    while (j< second.length ) {
      mix[k] = second[j];
      j++;
      k++;
    }
    
    return mix;

}

  
}
