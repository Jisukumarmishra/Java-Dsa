package Sortings;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));

  }

  static void quickSort(int[] nums, int low, int high) {

    if (low >= high) {
      return;
    }

    int s = low;
    int e = high;

    int mid = s + (e - s) / 2;

    int pivot = nums[mid];

    while (s <= e) {

      // also a reason why its already sorted it will not swapped matlal age pahle se
      // hi sored hai to koi swap operation perform nhi hoga

      while (nums[s] < pivot) {
        s++;
      }

      while (nums[e] > pivot) {
        e--;
      }

      if (s <= e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;

        s++;
        e--;

      }

    }

    // now my pivot is at correct index please sort two half now

    quickSort(nums, low, e);
    quickSort(nums, s, high);

  }
}
