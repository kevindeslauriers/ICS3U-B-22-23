import java.util.Arrays;

public class Recursion {
  public static void main(String[] args) {
    // System.out.println(factorial(7));

    // System.out.println(fibonacci(1000));

    int[] arr = { 6, 12, 87, 1, 90, 200, 2, 5, 26, 98, 56, 87, 102, 222, 75, 48, 32 };
    Arrays.sort(arr);

    System.out.println(binarySearchRecursion(arr, 56, 0, arr.length - 1));

  }

  private static int binarySearchRecursion(int[] arr, int findMe, int start, int end) {
    int mid = (start + end) / 2;

    if (start > end)
      return -1;
    else if (arr[mid] == findMe)
      return mid;
    else if (findMe < arr[mid])
      return binarySearchRecursion(arr, findMe, start, mid - 1);
    else
      return binarySearchRecursion(arr, findMe, mid + 1, end);

  }

  private static int binarySearch(int[] arr, int findMe) {
    int min = 0;
    int max = arr.length - 1;
    int mid;

    while (min <= max) {
      mid = (min + max) / 2;

      if (arr[mid] == findMe)
        return mid;
      else if (findMe < arr[mid])
        max = mid - 1;
      else
        min = mid + 1;
    }

    return -1;

  }

  static long[] results = new long[1001];

  private static long fibonacci(int n) {
    if (results[n] != 0)
      return results[n];

    if (n == 1 || n == 2)
      return 1;

    results[n] = fibonacci(n - 1) + fibonacci(n - 2);

    return results[n];
  }

  private static int factorial(int n) {
    if (n == 1)
      return 1;

    return n * factorial(n - 1);
  }
}
