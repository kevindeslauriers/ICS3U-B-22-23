package day2;

public class NestedIfStatements {
   public static void main(String[] args) {
      boolean isRed = true;
      boolean isDog = true;
      boolean isBig = true;
      boolean isYellow = false;
      boolean isBird = false;

      // if (isRed && isBig && isDog)
      // System.out.println("Hi Clifford!!!");
      if (isRed) {
         if (isBig) {
            if (isDog) {
               System.out.println("Hi Clifford!!!");
            }
         }
      } else if (isYellow) {
         if (isBird) {
            if (!isBig) {
               System.out.println("Hi Tweety!!!");
            }
         }
      }
   }

}
