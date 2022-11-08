package day2;

public class ForLoopExamples {
   public static void main(String[] args) {
      // exampleOne();
      // exampleTwo(1, 3);
      exampleThree("Check this String");

   }

   /* Introduction to for loops (counting loops) */
   private static void exampleOne() {
      // int i = 0;
      // int sum = 0;
      // while (i < 10) {
      // sum += i;
      // i++;
      // }
      int sum = 0;
      // for loop for(init counter; condition; increment counter) {}
      for (int i = 0; i < 10; i++) {
         sum += i;
      }

      // initialise (once)
      // check the condition
      // body
      // incrememt
      // condition
      // body
      // incrememt
      // condition
      // body
      // incrememt
      // condition
      // body

      // does not initialise
      // does not incrememnt
      // runs forever -> infinite loop
      // for (; true;) {

      // }

   }

   /* Obtain the sum of the numbers from start to end */
   private static void exampleTwo(int start, int end) {
      int sum = 0;

      for (int i = start; i <= end; i++) {
         sum += i;
      }

      System.out.println(sum);
   }

   /* count the number of words in the sentence */
   private static void exampleThree(String sentence) {
      int numWords = 1;
      for (int i = 0; i < sentence.length(); i++) {
         if (" ".equals(sentence.substring(i, i + 1)))
            numWords++;
      }

      System.out.println(numWords + " words.");
   }
}
