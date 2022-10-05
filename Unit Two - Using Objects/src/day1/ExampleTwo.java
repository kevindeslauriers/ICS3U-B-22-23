package day1;

public class ExampleTwo {
   public static void main(String[] args) {
      String s1 = new String("Happy");
      String s2 = new String("Happy");
      String s3 = "Happy";
      String s4 = "Happy";

      // two == for equality
      // one = for assignment
      System.out.println(s1 == s2); // false (different address)
      System.out.println(s1.equals(s2)); // true (same sequence of characters)

      // s3 == s4 is true (string literals are not recreated but reused)
   }
}
