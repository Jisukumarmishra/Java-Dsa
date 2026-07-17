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

  public static int queriesHelper(int i, int si, int sj, int qi, int qj) {
    if (qj <= si || qi >= sj) { // non overlapping
      return 0;
    } else if (si >= qi && sj <= qj) {// complete overlapp
      return tree[i];
    } else { // partial overlap
      int mid = (si + sj) / 2;
      int left = queriesHelper(2 * i + 1, si, mid, qi, qj);
      int right = queriesHelper(2 * i + 2, mid + 1, sj, qi, qj);
      return left + right;
    }
  }

  public static int queries(int[] arr, int qi, int qj) {
    int n = arr.length;
    return queriesHelper(0, 0, n - 1, qi, qj);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int n = arr.length;
    init(n);
    buildST(0, n - 1, 0, arr);

    // for (int i = 0; i < tree.length; i++) {
    // System.out.print(tree[i] + " ");
    // }

    System.out.print(queries(arr, 2, 5));

  }
}
