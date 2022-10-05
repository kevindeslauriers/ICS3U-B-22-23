package day1;

/**
 * ExampleOne
 */
public class ExampleOne {
   public static void main(String[] args) {
      String superStudent = new String("Callum");
      String baseballPitcher = new String("Nolan Ryan");

      System.out.println(superStudent);
      System.out.println("Length of superStudent: " + superStudent.length());
      System.out.println("Substring of superStudent 2 - 4: " + superStudent.substring(2, 4));

      System.out.println(baseballPitcher);
      System.out.println("Length of baseballPitcher: " + baseballPitcher.length());
      System.out.println("Substring of baseballPitcher 4 - 8: " + baseballPitcher.substring(4, 8));

      // Middle of a string is length() / 2
      // first half of a String is substring(0,length()/2)

      System.out.println(baseballPitcher.substring(0, baseballPitcher.length() / 2));

      // second half we start at length() / 2 and go to the end
      System.out.println(baseballPitcher.substring(baseballPitcher.length() / 2, baseballPitcher.length()));
      System.out.println(baseballPitcher.substring(baseballPitcher.length() / 2));

      System.out.println("Where is the first 'n' in 'Nolan Ryan'?");
      System.out.println(baseballPitcher.indexOf("n"));

   }

}