package day3;

/*
* ExampleOne: Primitive Data Types
*             Variables
*/
public class ExampleOne {
   public static void main(String[] args) {

      // Variables are meant to store and eventually recall data/information

      // the data could be anything (a number, a String of characters, true or false,
      // lst of accounts, etc...)

      // before we use a variable we must DECLARE it.
      // When we declare a variable we must state the type of data it will hold

      // Primitive types store the value (THEY ARE PRIMITIVE)
      // int -> integer
      // double -> decimal numbers
      // boolean -> true or false

      int numberOfStudents; // numberOfStudents has been declared as an int
      numberOfStudents = 14; // initialise the variable
      double testAverage = 63.7; // declared and initialised on the same line (gave it an initial value)
      final double PI = 3.14; // if the variable CANNOT by modified after it has been initialised then make it
                              // final.
      // PI = 6.2; Syntax error (won't compile) because PI is final
      // naming convention for constants (final) is
      // ALL_UPPER_CASE_WITH_UNDERSCORES_BETWEEN_WORDS

      boolean isHeads = false;
      boolean hasToes = true;

      System.out.println("There are " + numberOfStudents + " students in the class.");
      System.out.println("5 + 3 = " + 5 + 3); // 5 + 3 = 53
      System.out.println("5 + 3 = " + (5 + 3)); // 5 + 3 = 8

   }
}
