import java.util.Arrays;

public class SortingAlgorithms {
   public static void main(String[] args) {
      int[] arr1 = { 6, 2, 0, 3, 4, 2, 3, 56, 3, 3, 6, 4, 32, 6, 34, 7, 89, 90, 91 };
      // selectionSort(arr);
      // insertionSort(arr);
      // display(arr);
      int[] arr2 = { 6, 2, 10, 23, 4, 6, 4, 32, 16, 34, 7 };

      Arrays.sort(arr1);
      Arrays.sort(arr2);
      // display(arr1);
      // System.out.println();
      // display(arr2);
      int[] sortedArray = merge(arr1, arr2);
      display(sortedArray);
   }

   private static int[] merge(int[] arr1, int[] arr2) {
      int[] temp = new int[arr1.length + arr2.length];

      int i = 0;
      int j = 0;

      while (i < arr1.length && j < arr2.length) {
         if (arr1[i] <= arr2[j]) {
            temp[i + j] = arr1[i];
            i++;
         } else {
            temp[i + j] = arr2[j];
            j++;
         }
      }

      if (i != arr1.length) {
         for (; i < arr1.length; i++) {
            temp[i + j] = arr1[i];
         }
      } else {
         for (; j < arr2.length; j++) {
            temp[i + j] = arr2[j];
         }
      }

      return temp;

   }

   private static void insertionSort(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
         int val = arr[i];
         // int j;
         // for (j = i - 1; j >= 0 && val < arr[j]; j--) {
         // arr[j + 1] = arr[j];
         // }
         int j = i - 1;
         while (j >= 0 && val < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = val;
      }
   }

   private static void display(int[] arr) {
      for (int el : arr) {
         System.out.print(el + " ");
      }
   }

   private static void selectionSort(int[] arr) {

      // responsible for teh division between sorted and unsorted sides
      for (int i = 0; i < arr.length - 1; i++) {
         // responsible for looking for the smallest on the unsorted side
         int minIndex = i;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[minIndex] > arr[j])
               minIndex = j;
         }

         int temp = arr[i];
         arr[i] = arr[minIndex];
         arr[minIndex] = temp;
      }
   }
}
