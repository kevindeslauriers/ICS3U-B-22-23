public class ForEachLoop {
   public static void main(String[] args) {
      String[] feelings = { "Happy", "Sad", "Angry", "Blah", "Excited", "Sleepy" };

      // for each loop - meanyt to iterate through the WHOLE collection
      // cannot change the size of the collection - not a big deal for arrays
      // no access to the index
      // must iterate starting at index 0 to length-1

      for (String mood : feelings) {
         System.out.println(mood);
      }
   }
}
