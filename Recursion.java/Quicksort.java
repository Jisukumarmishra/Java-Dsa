public class Quicksort {
    // code for partation
    public static int partition (int arr[], int low, int high ) { //partation me hi hmara major work hota hai
        int pivot = arr[high]; //we start a last element as a pivot element;
        int i = low - 1;
        //array traverse
        for (int j = low;  j<high; j++ ) {
          if ( arr[j] < pivot ) {
            i++;
            //swap
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
        }  
        }// for pivot ke liye khali places
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }
     //code for quick sort 
     public static void quickSort ( int arr[], int low, int high) {
    if ( low<high ) {
        int pidx = partition ( arr, low , high );

           quickSort ( arr , low , pidx -1 ) ;
           quickSort ( arr, pidx +1, high );
    }
 }   
    public static void main (String[] args) {
        int arr [] = {6, 3, 9, 5, 2 };
        int n = arr.length;
        quickSort(arr, 0, n-1);
        //for printing  sorted array
        for ( int i = 0;i<n; i ++ ) {
            System.out.print(arr[i] +" " );
        }
        System.out.println();
     }
}
  //time complexity ;
  //worst: O(n^2) 
  //worst case happens when pivot is always the smallest or the largest element
  //avg: O(nlogn)