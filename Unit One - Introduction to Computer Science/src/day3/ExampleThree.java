package day3;

public class ExampleThree {
   public static void main(String[] args) {
      // System.out.println(17 / 5); // division
      // System.out.println(17 % 5); // modules (remainder)

      int number = 123456;

      // System.out.println(number / 100); // 5283
      // System.out.println(number % 100 / 10); // 7

      int digit1 = number / 100000 % 10; // 5
      int digit2 = number / 10000 % 10;
      int digit3 = number / 1000 % 10;
      int digit4 = number / 100 % 10;
      int digit5 = number / 10 % 10;
      int digit6 = number / 1 % 10;

      int sum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;

      System.out.println(sum);

   }
}
