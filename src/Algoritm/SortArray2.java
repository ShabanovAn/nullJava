package Algoritm;

import java.util.Arrays;

public class SortArray2 {
    public static void main(String[] args) {

        int[] array = new int[] {56, 324, 2, 14,55,67,33, 1000};
        int minArray = array[0];
        int minIndex = 0;
        boolean valid = false;
        while (!valid) {
            valid = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    minIndex = i;
                    valid = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
