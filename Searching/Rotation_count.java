package SearchingKunal;

// find the rotation count in rotated sorted array
// solution:- array is rotated pivot(index) +1 times 

public class Rotation_count {
  public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
      System.out.println(countRotations(arr));
  }

  private static int countRotations (int[] arr) {
    int pivot = findPivot( arr);
    return pivot+1;
  }
  // use this for duplicate  
  static int findPivot(int [] arr) {
  int start =0;
  int end = arr.length-1;
  while(start<=end) {
    int mid = start + (end -start ) /2 ;
    // 4 cases over here 
    if(mid < end && arr[mid] >arr[mid+1]) {
      return  mid;
    }

    if (arr[mid] < arr[mid-1]) {
      return mid -1 ;
    } 

    if (arr[mid] <=arr[start]) {
        end = mid -1;
    } else {
        start = mid+1;
      }
    }
    return -1;

  }

// use this when a duplicate rotated array 

  static int findPivotwithDuplicate (int [] arr) {
  int start =0;
  int end = arr.length-1;
  while(start<=end) {
    int mid = start + (end -start ) /2 ;
    // 4 cases over here 
    if(arr[mid] >arr[mid+1]) {
      return  mid;
    }

    if (arr[mid] < arr[mid-1]) {
      return mid -1 ;
    } 
    // if elements at midle , start,, end are equal then just skip the duplicates
    if (arr[mid] ==arr[start] && arr[mid]== arr[end]) {
      // skip the duplicates
      // note: what if these elements at start and end were the pivot ??
      // check if start is pivot
      if(arr[start] > arr[start +1]) {
       return start;
      }
      start ++;

      // check whether end is pivot 

      if(arr[end] < arr[end -1]) {
        return end -1;
      }

      end -- ;

    }
    // left side is sorted , so pivot should be in right 
    else if (arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
      start = mid +1;
    } else {
      end = mid -1;
    }
  }
    return -1;
 }
}
