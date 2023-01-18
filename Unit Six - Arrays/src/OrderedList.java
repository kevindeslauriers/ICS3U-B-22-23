public class OrderedList {
   private int[] data;
   private int manyItems;

   private final int DEFAULT_CAPACITY = 10;

   public OrderedList() {
      this.data = new int[DEFAULT_CAPACITY];
      this.manyItems = 0;
   }

   public OrderedList(int capacity) {
      if (capacity < 1) {
         throw new IllegalArgumentException("Capacity must be at least 1");
      }

      this.data = new int[capacity];
      this.manyItems = 0;
   }

   public void add(int val) {
      if (data.length == manyItems) {
         updateCapacity(data.length * 2);
      }

      data[manyItems] = val;
      manyItems++;
   }

   /* Get the element at the specified index */
   public int get(int index) {
      if (index >= manyItems)
         throw new IndexOutOfBoundsException("Index " + index + " is greater than " + (manyItems - 1));

      if (index < 0)
         throw new IllegalArgumentException("Index must be positive.");

      return data[index];
   }

   /* Set the element at index to be val and return what was there initially. */
   public int set(int index, int val) {
      if (index >= manyItems)
         throw new IndexOutOfBoundsException("Index " + index + " is greater than " + (manyItems - 1));

      if (index < 0)
         throw new IllegalArgumentException("Index must be positive.");

      int temp = data[index];
      data[index] = val;
      return temp;
   }

   public void add(int index, int val) {
      if (index > manyItems)
         throw new IndexOutOfBoundsException("Index " + index + " is greater than " + manyItems);

      if (index < 0)
         throw new IllegalArgumentException("Index must be positive.");

      if (data.length == manyItems) {
         updateCapacity(data.length * 2);
      }

      for (int i = manyItems; i > index; i--) {
         data[i] = data[i - 1];
      }

      data[index] = val;
      manyItems++;
   }

   private void updateCapacity(int newCapacity) {
      int[] temp = new int[newCapacity];

      for (int i = 0; i < data.length; i++) {
         temp[i] = data[i];
      }

      data = temp;
   }

   public int remove(int index) {
      if (index >= manyItems)
         throw new IndexOutOfBoundsException("Index " + index + " is greater than " + (manyItems - 1));

      if (index < 0)
         throw new IllegalArgumentException("Index must be positive.");

      int temp = data[index];
      for (int i = index; i <= manyItems; i++) {
         data[i] = data[i + 1];
      }

      manyItems--;
      return temp;
   }

   public int size() {
      return manyItems;
   }

}
