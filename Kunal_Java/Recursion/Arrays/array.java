package Arrays;
public class array {
  public static void main(String[] args) {
    int [] arr = {2,5,9};
    System.out.println(findSorted(arr, 0));
    
  }
  static boolean findSorted (int [] arr, int index ){
    if ( index == arr.length -1) {
    return true;
    }

    return arr[index ] < arr[index + 1] && findSorted(arr, index+1);
  }
}
