import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 2, 12, 54, 6, 3, 21, 100, 23, 53, 25, 763, 23, 98, 32 };
    Arrays.sort(arr);

    // int index = binarySearchIterative(arr, 53);
    int index = binarySearchRecursive(arr, 53, 0, arr.length - 1);
    System.out.println(index);

  }

  private static int binarySearchRecursive(int[] arr, int findMe, int min, int max) {
    int mid = (min + max) / 2;
    if (min > max)
      return -1;
    else if (arr[mid] == findMe)
      return mid;
    else if (arr[mid] < findMe)
      return binarySearchRecursive(arr, findMe, mid + 1, max);
    else
      return binarySearchRecursive(arr, findMe, min, mid - 1);
  }

  private static int binarySearchIterative(int[] arr, int findMe) {

    int min = 0;
    int max = arr.length - 1;
    int mid = (min + max) / 2;

    while (min <= max) {
      mid = (min + max) / 2;

      if (arr[mid] == findMe)
        return mid;
      else if (arr[mid] < findMe)
        min = mid + 1;
      else
        max = mid - 1;
    }

    return -1;

  }
}
