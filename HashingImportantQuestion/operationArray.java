package HashingImportantQuestion;
  import java.util.*;
public class operationArray {
// union of 2 array

public static int union ( int arr1[] , int arr2[]) {
    HashSet<Integer> set = new HashSet<>();
    for( int i=0 ; i<arr1.length; i++ ) {
        set.add(arr1[i]);
    }
    for( int j =0 ; j<arr2.length; j++ ) {
        set.add(arr2[j]);
    }
    return set.size();
}
// intersection of two artray
 public static int Intersection (int arr1[], int arr2[]) {
    HashSet<Integer> set = new HashSet<>();
    for( int i=0 ; i<arr1.length; i++ ) {
        set.add(arr1[i]);
    }
    for ( int j= 0; j<arr2.length; j++) {
       if (arr2[j] == arr1[i] ) {
        set.remove(arr2[j]);
       } else {
        set.add(arr2[j]);
       }
    }

}
public static void main (String args[] ) {
    int arr1 [] = {7, 3, 9 };
    int arr2 [] = {6, 3, 9, 2, 9, 4 };
    System.out.println(union(arr1, arr2));
}

}
