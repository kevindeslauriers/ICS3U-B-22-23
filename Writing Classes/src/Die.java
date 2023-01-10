public class Die {
   /*
    * attributes define the state of this Object and they should be private so only
    * the class has access to them
    */
   private int numSides;
   private int topSide;

   // If you do not explicitly write a constructor Java will supply a no-arg
   // constructor by default that does NOTHING

   // The Constructor is used to create an instance of the Class
   // Generally public so they can be called directly.
   // Initializes the state (attributes) of the class.

   public int getTopSide() {
      return topSide;
   }

   public String toString() {
      return "The top side is: " + this.topSide;
   }

   // we can create as many constructors as we want
   public Die(int numSides) {
      this.numSides = numSides;
      // this refers to this instance of the Die
      roll();
   }

   // When the constructor does not take any parameters it is called the default
   // constructor
   public Die() {
      numSides = 6;
      roll();
   }

   // sets the top side to be a number between 1 and numSides inclusive
   public void roll() {
      this.topSide = (int) (Math.random() * numSides) + 1;
   }

}
