package Searching;

import java.util.ArrayList;

public class linearSearch {
  public static void main(String[] args) {

    int[] arr = { 4, 3, 2, 4, 4, 6 };

    // System.out.println(find(arr, 4,0));
    // System.out.println(findIndex(arr, 4, 0));
    // System.out.println(findIndexLast(arr, 4, arr.length-1));
    // findallIndex(arr, 4, 0);
    // System.out.println(list);
    // ArrayList<Integer> ans = findallIndex1(arr, 4, 0, new ArrayList<>());
    // System.out.println(ans);

    System.out.println(findallIndex2(arr, 4, 0));

  }

  public static boolean find(int[] arr, int target, int index) {
    if (index == arr.length) {
      return false;
    }
    // if (arr[index] == target ) {
    // return true;
    // }
    // return sorted(arr, target, index+1);

    return arr[index] == target || find(arr, target, index + 1);

  }

  public static int findIndex(int[] arr, int target, int index) {
    if (index == arr.length) {
      return -1;
    }

    if (arr[index] == target) {
      return index;
    } else {
      return findIndex(arr, target, index + 1);
    }

  }

  static int findIndexLast(int[] arr, int target, int index) {
    if (index == -1) {
      return -1;
    }

    if (arr[index] == target) {
      return index;
    } else {
      return findIndexLast(arr, target, index - 1);
    }

  }

  static ArrayList<Integer> list = new ArrayList<>();

  static void findallIndex(int[] arr, int target, int index) {
    if (index == arr.length) {
      return;
    }

    if (arr[index] == target) {
      list.add(index);
    }
    findallIndex(arr, target, index + 1);
  }

  static ArrayList<Integer> findallIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
    if (index == arr.length) {
      return list;
    }

    if (arr[index] == target) {
      list.add(index);
    }
    return findallIndex1(arr, target, index + 1, list);

  } // each list are different refrrence varriables but pointing to the same object

  static ArrayList<Integer> findallIndex2(int[] arr, int target, int index) {

    ArrayList<Integer> list = new ArrayList<>();

    if (index == arr.length) {
      return list;
    }

    // this will contains answer for that functon call only

    if (arr[index] == target) {
      list.add(index);
    }
    ArrayList<Integer> ansFromBelow = findallIndex2(arr, target, index + 1);

    list.addAll(ansFromBelow);
    return list;
  }

}
