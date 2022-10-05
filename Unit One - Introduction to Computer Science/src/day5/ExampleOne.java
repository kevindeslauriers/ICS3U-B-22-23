package day5;

import java.util.Scanner;

public class ExampleOne {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter the radius: ");
      double radius = in.nextDouble();

      double area = Math.PI * radius * radius;

      System.out.println("The area of the circle with radius " + radius + " is " + area);

      in.close();
   }
}
