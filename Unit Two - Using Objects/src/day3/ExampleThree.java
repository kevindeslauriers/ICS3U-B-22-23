package day3;

/* Math class: All the methods in the math class are static and we do NOT need an instance of the object to call the methods. */
public class ExampleThree {
   public static void main(String[] args) {
      System.out.println(Math.abs(-3)); // 3
      System.out.println(Math.abs(-45.9)); // 45.9

      System.out.println(Math.pow(5, 3)); // yields 5 to the power 3 => 125 or 5x5x5

      System.out.println(Math.sqrt(64)); // Square root of 64

      System.out.println(Math.random()); // a random number from 0 to 1 but not including 1 (0.0000000 to 0.99999999)

      int randomNumber = (int) (Math.random() * 10) + 1; // it would have been 0.0000000 * 9.9999999 then cast so you
                                                         // get 0 -> 9 and add 1 so you get 1 -> 10

      /*
       * Formula for random numbers is (int)(Math.random() * numberOfOptions) +
       * startingValue
       */

      int rand = (int) (Math.random() * 201) - 100;
      // random number from -100 to 100

   }
}