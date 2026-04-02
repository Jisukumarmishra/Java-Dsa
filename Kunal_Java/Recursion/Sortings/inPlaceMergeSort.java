package Sortings;

import java.util.Arrays;

public class inPlaceMergeSort {
  // that means not creatin a new object manupulate the same array ang give the
  // anser
  public static void main(String[] args) {
    int arr[] = { 5, 4, 3, 2, 1 };
    inPlacermergeort(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));

  }

  static void inPlacermergeort(int[] arr, int s, int e) {
    if (e - s == 1) {
      return;
    }

    int mid = s + (e - s) / 2;

    inPlacermergeort(arr, s, mid);
    inPlacermergeort(arr, mid, e);

    merge(arr, s, e, mid);

  }

  private static void merge(int[] arr, int s, int e, int m) {

    int mix[] = new int[e - s];

    int i = s;
    int j = m; // jo ekk array do me divide hota hai ushi i s se start ho rha hai and dusre
               // side j mid se
    int k = 0;

    while (i < m && j < e) {
      if (arr[i] < arr[j]) {
        mix[k] = arr[i];
        i++;
        k++;
      } else {
        mix[k] = arr[j];
        j++;
        k++;
      }

    }

    while (i < m) {
      mix[k] = arr[i];
      i++;
      k++;
    }

    while (j < e) {
      mix[k] = arr[j];
      j++;
      k++;
    }
    // returnign the original arrary

    for (int l = 0; l < mix.length; l++) {
      arr[s + l] = mix[l];

    }
  }
}
