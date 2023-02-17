package project_utils;

public class CreateArray {
    public int[] createIntArray(int l) {

        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {

            array[i] = i+1;
        }
        return array;
    }
}
