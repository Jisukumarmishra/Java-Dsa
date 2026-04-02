package backTracking;
public class ArrayBT {
  // ek array me aage badhte time value add akr rhe hai and niche aate time vaiue ghata rha e hai uske liye recursive code 
  public static void main(String[] args) {
    int [] arr = new int [5];
    chageArr(arr, 1,0);
    printArr(arr);
  }

  static void chageArr (int[] arr,int value, int i) {
    // base case
    if (i== arr.length) {
      printArr(arr);
      return ;
    }
    arr[i] = value; // uppera jate hue array me suruaate vale value assign kiya 
    chageArr(arr, value+1, i+1);// function call step , funcn call till reach the base case only after the go compiler to nexsxt step 
    arr[i] = arr[i]-2;  // backtracking step , after completing the recursive funcation then rech to this sterp
    // bt hamesha funcn call ke bad hi hogi
  }

  public static void printArr (int [] arr) {
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

}

// tc:- kitne step perform kiya shpow 2n then O(n)
