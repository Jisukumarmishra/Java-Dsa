package Searching;

public class rbs {
  public static void main(String[] args) {
    int[] arr = { 5, 6, 1, 2, 3, 4 };
    System.out.println(search(arr, 4, 0, arr.length - 1));

  }

  static int search(int[] arr, int target, int s, int e) {
    // base case

    if (s > e) {
      return -1;
    }

    int mid = s + (e - s) / 2;

    if (target == arr[mid]) {
      return mid;
    }
    if (arr[s] <= arr[mid]) {
      if (target >= arr[s] && target <= arr[mid]) {
        return search(arr, target, s, mid - 1);
      }
    }

    if (target >= arr[mid] && target <= arr[e]) {
      return search(arr, target, mid + 1, e);
    } else {
      return search(arr, target, s, mid - 1);
    }

  }
}
