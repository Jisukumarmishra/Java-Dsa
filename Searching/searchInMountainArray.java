package SearchingKunal;
public class searchInMountainArray {
  // leetcode quesyion number 1095
  public static void main(String[] args) {
    int [] arr = {1, 3, 5, 6, 5, 3, 1};
    int target = 5;
    int index = search(arr, target);

    if(index!=-1) {
      System.out.println("Target Found at index :" + index );
      System.out.println("Target value:" + arr[index]);
    } else {
      System.out.println("target is not found ");
    }
  }

  public static int search (int [] arr, int target ) {
    int peak = peakIndexMountainArray(arr);
    int firstTry = orderAgnosticBS(arr, target,0, peak);
    if(firstTry != -1 ) {
      return firstTry;
    }
    // try to search in second half
    return orderAgnosticBS(arr, target, peak+1 , arr.length-1);
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
    return start;
  }

  static int orderAgnosticBS (int arr[] ,int target, int start, int end) {

    // find whether the array is sorted in ascending or descending
    boolean isAsc = arr[start] <arr[end];


    while(start<= end) {


      int mid = start + (end -start) / 2 ;
      if ( arr[mid] == target ) {
        return mid;
      }

      if(isAsc) {

        if (target > arr[mid] ) {
         start = mid +1 ;
        } else {
        end = mid-1;
       }

     } else {

      if (target < arr[mid] ) {
      start = mid +1 ;
      } else {
       end = mid-1;
      }
     }
    }
    return -1;
  }
 }


//  public class SearchInMountainArray {

//     public static int search(int[] arr, int target) {

//         int peak = peakIndexMountainArray(arr);

//           1️⃣ Search in ascending part (LEFT SIDE)
//         int index = orderAgnosticBS(arr, target, 0, peak);
//         if (index != -1) {
//             return index;   // smallest index
//         }

//            2️⃣ Search in descending part (RIGHT SIDE)
//         return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
//     }

//     static int peakIndexMountainArray(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start < end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] > arr[mid + 1]) {
//                 end = mid;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return start;
//     }

//     static int orderAgnosticBS(int[] arr, int target, int start, int end) {

//         boolean isAsc = arr[start] < arr[end];

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target > arr[mid]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             } else {
//                 if (target < arr[mid]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

