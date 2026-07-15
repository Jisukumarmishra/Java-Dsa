package SegmentTree;
// creations of segment tree
class Main {
  static int[] tree;

  public static void init(int n) {
    tree = new int[4 * n];
  }

  public static int buildST(int[] arr, int sti, int s, int e) {
    if (s == e) {
      tree[sti] = arr[s];
      return arr[s];
    }

    int mid = (s + e) / 2;
    // left subtree build
    buildST(arr, 2 * sti + 1, s, mid);
    buildST(arr, 2 * sti + 2, mid + 1, e);
    tree[sti] = tree[2 * sti + 1] + tree[2 * sti + 2];
    return tree[sti];
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int n = arr.length;
    init(n);
    buildST(arr, 0, 0, n - 1);

    for (int i = 0; i < tree.length; i++) {
      System.out.print(tree[i] + " ");
    }
  }

}

// segment tree construct:--> O(n)
// query---> O(logn)
// update--> O(logn)
