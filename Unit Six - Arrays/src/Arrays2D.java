import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Arrays2D {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int T = in.nextInt();
      HashMap<Integer, Set<Integer>> coordinates = new HashMap<Integer, Set<Integer>>();
      for (int i = 0; i < T; i++) {
         int x = in.nextInt();
         Set<Integer> yVals = coordinates.get(x);
         if (yVals == null) {
            yVals = new HashSet<Integer>();
         }
         yVals.add(in.nextInt());
         coordinates.put(x, yVals);
      }

      int biggest = 0;

   }
}
