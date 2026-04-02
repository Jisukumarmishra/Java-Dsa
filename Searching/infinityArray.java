package SearchingKunal;
public class infinityArray {

// infinity array  i.e without use of array.length
public static void main(String[] args) {
  int [] arr = {
    3, 5, 6, 8 ,10, 78, 98, 99, 120 , 300
  };
  int target = 10;
  System.out.println(ans(arr, target));
}


static int ans ( int [] arr, int target ) {
  // first find the range
  // first start with a box of size 2
  int start =0;
  int end =1;

  // condation for the target lie between in the range
  while (target > arr[end] ) {  //“Jab tak target array ke end element se bada hai, range expand karo”
  int newStart = end +1;
  // double the box value
// new end = prevoius end + sizeofbox *2 
end = end+ (end-start +1) * 2 ;
start = newStart;
}
return binarySearch(arr, target, start, end);
}

static int binarySearch(int[] arr, int target, int start, int end ) {
  while (start <=end) {
  int mid = start+ (end-start) / 2 ;
  if(target<arr[mid]) {
    end = mid-1;
  } else if (target > arr[mid]) {
      start = mid+1;
    } else {
      return mid;
    }
  }
  return -1;
}
}
