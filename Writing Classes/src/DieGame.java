public class DieGame {
   public static void main(String[] args) {
      Die die2 = new Die();
      Die die1 = new Die(6);

      int num1Wins = 0;
      int num2Wins = 0;
      int ties = 0;
      for (int i = 0; i < 10000; i++) {

         die1.roll();
         die2.roll();
         /*
          * System.out.print("Die1: ");
          * System.out.println(die1); // when we print the Die we call its toString
          * method
          * System.out.print("Die2: ");
          * System.out.println(die2); // when we print the Die we call its toString
          * method
          */
         if (die1.getTopSide() > die2.getTopSide())
            num1Wins++;
         else if (die1.getTopSide() < die2.getTopSide())
            num2Wins++;
         else
            ties++;
      }

      System.out.println("1: " + num1Wins);
      System.out.println("2: " + num2Wins);
      System.out.println("Ties: " + ties);

   }
}
