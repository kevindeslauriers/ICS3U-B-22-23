package day1;

public class UsingIfStatements {
   public static void main(String[] args) {
      /*
       * if (boolean expression){
       * // do this block of code when the boolean expression is true
       * }
       */
      // if {} are missing then it does 1 line of code is executed.

      int x = 7;

      if (x % 2 == 0)
         System.out.println(x + " is even.");
      else
         System.out.println(x + " is odd.");

      // int y = 10;

      // if (y > 10) // no curly braces then we exected 1 line after if it is true
      // y++;
      // System.out.println(y);

      // if (y > 10) { // no curly braces then we exected 1 line after if it is true}
      // y++;
      // System.out.println(y);
      // }

   }
}
