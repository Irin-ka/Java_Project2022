public class OddIndices {

    public int[] oddIndices(int[] array) {
      // int[] array = new int []{-45, 590, 234, 985, 12, 68};
       int[] oddArray = new int[array.length/2]; //созд массив в 2 раза меньше
        int j = 0;
       for (int i = 1; i < array.length; i+=2)  {
               oddArray[j] = array[i];
               j++;
       }
        return oddArray;
    }
}
