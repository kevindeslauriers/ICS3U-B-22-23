package day3;

public class ExampleTwo {
   public static void main(String[] args) {
      int age1 = 16, age2 = 17, age3 = 20;
      final int numStudents = 3; // final variables are constant and we cannot reassign them

      double averageAge = (double) (age1 + age2 + age3) / numStudents;

      // numStudents = 4; // final variables are constant and we cannot reassign them

      // type casting is when we temporarily treat a variable as a different type -->
      // (type) variableName

      System.out.println(averageAge);
   }
}
