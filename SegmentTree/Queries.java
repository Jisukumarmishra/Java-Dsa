package SegmentTree;

public class Queries {
  static int[] tree;

  public static void init(int n) {
    tree = new int[4 * n];
  }

  public static int buildST(int s, int e, int i, int[] arr) {
    if (s == e) {
      tree[i] = arr[s];
      return arr[s];
    }

    int mid = (s + e) / 2;
    buildST(s, mid, 2 * i + 1, arr);
    buildST(mid + 1, e, 2 * i + 2, arr);
    tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    return tree[i];

  }

  public static int getSum(int[] arr, int i, int s, int e) {

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int n = arr.length;
    init(n);
    buildST(0, n - 1, 0, arr);

    for (int i = 0; i < tree.length; i++) {
      System.out.print(tree[i] + " ");
    }

  }
}
