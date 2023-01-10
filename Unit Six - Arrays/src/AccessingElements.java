public class AccessingElements {
   public static void main(String[] args) {
      declaringArrays();

      int[] arr = { 5, 7, 1, 3, 4, 6 };
      accessingArrays(arr);
      System.out.println(arr[0]);
   }

   private static void accessingArrays(int[] arr) {
      System.out.println(arr[0]); // 5
      System.out.println(arr[3]); // 3
      System.out.println(arr[arr.length - 1]); // 6
      System.out.println(arr[arr.length / 2]); // 3

      arr[0] = 100;
      System.out.println(arr[0]);
   }

   private static void declaringArrays() {
      // declare int array called arr
      // initialise with a series of ints
      int[] arr = { 3, 6, 2, 3, 5, 6, 3, 2, 9, 0 };

      // declare double array called nums
      // initialise it to a double array of length 10
      double[] nums = new double[10];

      // having nums refer (point) to a different double array.
      nums = new double[6];
   }
}
