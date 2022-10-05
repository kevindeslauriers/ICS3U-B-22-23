package day5;

import java.util.Scanner;

public class ExampleTwo {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter a decimal number: ");
      double number = in.nextDouble();

      number = Math.round(number * 100) / 100.0;
      System.out.println(number);

      System.out.print("Please enter an integer number: ");
      int iNumber = in.nextInt();
      iNumber = (int) Math.round(iNumber / 100.0) * 100;
      System.out.println("Rounded: " + iNumber);
   }
}
