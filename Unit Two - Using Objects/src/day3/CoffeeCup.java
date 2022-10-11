package day3;

public class CoffeeCup {
   private int sizeInOunces;
   private int amountLeft;

   /*
    * Constructor: Creates a coffee cup of a specified size in ounces. The coffee
    * cup will be empty.
    */
   public CoffeeCup(int size) {
      sizeInOunces = size;
      amountLeft = 0;
   }

   /*
    * Constructor: Create a coffee cup of a specified size and sets if it is full
    * or not.
    */
   public CoffeeCup(int size, boolean isFull) {
      sizeInOunces = size;
      if (isFull)
         sizeInOunces = size;
   }

   /*
    * Public method that takes NO parameters: Identifies if the Coffee Cup is full
    * or not. If it is full it returns true. If it is not it return false.
    */
   public boolean isFull() {
      return sizeInOunces == amountLeft;
   }

   /*
    * Public method that takes NO parameters: Returns the number of ounces that are
    * left in the Coffee Cup.
    */
   public int getAmountLeft() {
      return amountLeft;
   }

   /*
    * Public method that takes NO parameters: Returns the Percent of coffee that is
    * left in the CoffeeCup.
    */
   public double percentLeft() {
      return ((double) amountLeft / sizeInOunces) * 100;
   }

   /*
    * Public method that takes NO parameters: The method takes a drink of coffee
    * from the cup. The amount that is drunk is 1 ounce of coffee. After the method
    * is called the Coffee Cup will have one less ounce of coffee in it. If the cup
    * was already empty then no coffee is removed from the Cup.
    */

   public void drink() {
      if (amountLeft > 0)
         amountLeft--;
   }

   /*
    * Public method that takes an integer parameter representing the number of
    * ounces of coffee to add to the Coffee Cup. If adding this amount to the cup
    * overfills the cup it will fill the cup.
    */
   public void addCoffee(int numOunces) {
      amountLeft += numOunces;
      if (amountLeft > sizeInOunces)
         amountLeft = sizeInOunces;
   }
}