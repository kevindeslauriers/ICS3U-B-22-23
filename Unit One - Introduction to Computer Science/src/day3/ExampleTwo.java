package day3;

public class ExampleTwo {
   public static void main(String[] args) {
      int age1 = 16, age2 = 17, age3 = 20;
      double averageAge;
      final int NUMBER_OF_STUDENTS = 3; // do not declare as a double

      // averageAge = (age1 + age2 + age3) / 3; // int / int = int (truncates the
      // decimal)

      averageAge = (double) (age1 + age2 + age3) / NUMBER_OF_STUDENTS;

      System.out.println(averageAge);

      int x = (int) 6.4;
      // boolean isFun = (boolean) 3; cannot cast an int into a boolean

   }
}
