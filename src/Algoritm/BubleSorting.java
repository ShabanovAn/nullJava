package Algoritm;

import java.util.Arrays;

public class BubleSorting {
    public static void main(String[] args) {
        int[] array = new int[] {4,3421,132,23,1,23,213,12,3,345,2435,2,2344,34,23,423,21,3425,425};

        boolean sortet = false;//sorted =0
        while (!sortet) {
            sortet = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sortet = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
