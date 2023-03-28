public class MultiDimensionalArrays {

  public static void main(String[] args) {
    // exampleOne();
    // exampleTwo();
    // exampleThree(2, 8);
    // exampleFour();
    exampleFive(); // can't do it. I tried

  }

  private static void exampleFive() {
    int[][] arr2D = new int[4][];

    for (int i = 0; i < arr2D.length; i++) {
      // arr2D[i]={1,2,6,9}; // :(
    }

    display(arr2D);

    int sum = sum2DArray(arr2D);

    System.out.println("The sum of the elements in the 2D Array is " + sum);
    System.out.println();

  }

  private static void exampleFour() {
    int[][] arr2D = { null, null, { 0, 0, 2, 3, 4, 5, 6, 7, 7, 6 } };

    display(arr2D);

    int sum = sum2DArray(arr2D);

    System.out.println("The sum of the elements in the 2D Array is " + sum);
    System.out.println();
  }

  private static void exampleThree(int numRows, int numCols) {
    int[][] arr2D = new int[numRows][numCols];

    populate(arr2D);

    display(arr2D);

    int sum = sum2DArray(arr2D);

    System.out.println("The sum of the elements in the 2D Array is " + sum);
    System.out.println();

  }

  private static void exampleTwo() {
    int[][] arr2D = new int[4][];

    for (int i = 0; i < arr2D.length; i++) {
      arr2D[i] = new int[i + 1];
    }

    display(arr2D);

    int sum = sum2DArray(arr2D);

    System.out.println("The sum of the elements in the 2D Array is " + sum);
    System.out.println();
  }

  private static int sum2DArray(int[][] arr2d) {
    int sum = 0;

    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        sum += arr2d[i][j]; // row first column second
      }
    }

    return sum;
  }

  private static void exampleOne() {
    int[][] arr2D = new int[4][6];

    populate(arr2D);

    display(arr2D);

    int sum = sum2DArray(arr2D);

    System.out.println("The sum of the elements in the 2D Array is " + sum);
    System.out.println();

  }

  private static void populate(int[][] arr2D) {
    int x = 0;
    // traverse using row-major order
    // one row at a time
    for (int i = 0; i < arr2D.length; i++) {
      for (int j = 0; j < arr2D[i].length; j++) {
        arr2D[i][j] = x;
        x++;
      }
    }

  }

  private static void display(int[][] arr2d) {
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        System.out.printf("%4d", arr2d[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

}
