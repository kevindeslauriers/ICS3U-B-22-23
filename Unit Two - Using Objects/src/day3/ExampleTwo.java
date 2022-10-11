package day3;

/* Using the Wrapper classes: Integer and Double class */
public class ExampleTwo {
   public static void main(String[] args) {
      Integer numDogs = new Integer(5);
      int iNumDogs = numDogs;
      numDogs++;
      iNumDogs++;
      System.out.println(numDogs);
      System.out.println(iNumDogs);
      System.out.println(numDogs.intValue());

      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);

      Double average = new Double(89.5);
      double dAverage = average;
      average++;
      dAverage++;

      System.out.println(average);
      System.out.println(dAverage);
      System.out.println(average.doubleValue());
   }
}
