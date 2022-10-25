package day1;

public class BooleanExpressions {
   public static void main(String[] args) {
      // mathematical expression evaluate to a number
      // logical and boolean expressions evaluate to TRUE and/or FALSE

      // >, <, >=, <=, ==, !=
      boolean exp1 = 17 > 5; // true
      boolean exp2 = 17 == 17; // true
      boolean isRed = true;
      boolean isHard = false;

      boolean exp3 = isHard == isRed; // false

      int x = 7;
      boolean exp4 = (x < 3) != (x > 5); // true because false is not equal to true

      int y = 3;
      boolean exp5 = (x < y) == (y > 7); // false == false => true

      // Compound Boolean Expressions
      // AND (&&), OR (||), NOT (!)

      // not operator

      boolean isGreen = true;
      boolean exp6 = !isGreen;

      boolean exp7 = !true; // false
      boolean exp8 = !false; // true

      boolean isBlue = false;
      isHard = true;
      boolean isHardBlue = isBlue && isHard; // (&& requires both left and right side to be true if it is going to be
                                             // true)

      boolean isBlueOrHard = isBlue || isHard; // false || true (or requires 1 of then to be true in order to be true)

      x = 7;
      y = 17;
      boolean exp9 = (x > 7) && (y < 25);

   }
}
