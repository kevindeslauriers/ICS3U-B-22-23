package day2;

/**
 * ElseIf
 */
public class ElseIfStatements {
   public static void main(String[] args) {
      int grade = 67;
      if (grade >= 95)
         System.out.println("A+");
      else if (grade >= 80)
         System.out.println("A");
      else if (grade >= 70)
         System.out.println("B");
      else if (grade >= 60)
         System.out.println("C");
      else if (grade >= 50)
         System.out.println("D");
      else
         System.out.println("F");

   }

}