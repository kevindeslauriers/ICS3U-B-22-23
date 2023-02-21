import java.util.Arrays;

public class SearchingAlgorithms {
   public static void main(String[] args) {
      // int[] arr = { 6, 2, 0, 3, 4, 2, 3, 56, 3, 3, 6, 4, 32, 6, 34, 7 };
      // selectionSort(arr);
      // insertionSort(arr);

      // int findMe = 7;
      // int index = sequentialSearch(arr, findMe);
      // Arrays.sort(arr);
      // display(arr);
      // findMe = 68;
      // index = binarySearch(arr, findMe);
      // System.out.println();
      // System.out.println(index);

      for (int i = 0; i < 8; i++) {
         int[] arr = new int[(int) (Math.pow(10, i))];
         int findMe = -1;
         binarySearch(arr, findMe);
      }

   }

   private static int binarySearch(int[] arr, int findMe) {
      int min = 0, max = arr.length - 1;
      int mid;
      int counter = 0;
      while (min <= max) {
         counter++;
         mid = (min + max) / 2;
         if (arr[mid] == findMe)
            return mid;
         else if (arr[mid] < findMe)
            min = mid + 1;
         else
            max = mid - 1;
      }
      System.out.println(arr.length + ": " + counter);
      return -1;

   }

   private static int sequentialSearch(int[] arr, int findMe) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == findMe)
            return i;
      }

      return -1;
   }

   private static void display(int[] arr) {
      for (int el : arr) {
         System.out.print(el + " ");
      }
   }

}
