public class IteratingArrays {
   public static void main(String[] args) {
      int[] arr = { 4, 6, 3, 2, 65, 3, 2, 1 };

      int sum = getSum(arr);
      System.out.println(sum);

      double sum2 = getBetterAverage(arr);
      System.out.println(sum2);

      displayBackwards(arr);

      int index = linearSearch(arr, 65);
      System.out.println(index);
      index = linearSearch(arr, 7);
      System.out.println(index);

   }

   private static int linearSearch(int[] arr, int val) {
      for (int j = 0; j < arr.length; j++) {
         if (arr[j] == val)
            return j;
      }

      return -1;
   }

   private static void displayBackwards(int[] arr) {
      for (int i = arr.length - 1; i >= 0; i--) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   private static double getBetterAverage(int[] arr) {
      int min = arr[0];
      int max = arr[0];
      int sum = 0;

      for (int j = 0; j < arr.length; j++) {
         if (min > arr[j])
            min = arr[j];

         if (max < arr[j])
            max = arr[j];

         sum += arr[j];
      }

      return (sum - min - max) / (double) (arr.length - 2);
   }

   private static int getSum(int[] arr) {
      int sum = 0;

      for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
      }

      return sum;
   }
}
