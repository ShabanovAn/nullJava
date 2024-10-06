package Algoritm;

import java.util.Arrays;

public class LeartBubleSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(numbers) + " No sort");
        int tmp;
        boolean status = false;

        while (!status) {
            status = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = tmp;
                    status = false;
                }
            }
        }

        System.out.println(Arrays.toString(numbers) + "  sort");
    }
}
