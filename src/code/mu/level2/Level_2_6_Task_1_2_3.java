package code.mu.level2;

import java.util.Arrays;

public class Level_2_6_Task_1_2_3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3, 0,8, 10,11};
        //System.out.println(Level_2_6_Task_1_2_3.sumElements(numbers));
        Level_2_6_Task_1_2_3.PrintTheElementsOfThisArrayToTheConsoleUpTtoTheFirstZero(numbers);
    }

    public static int sumElements(int[] elements) {
        int result = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > 0 && elements[i] < 10) {
                result += elements[i];
            }
        }
        return result;
    }

    public static int sumPositiveNumbers(int[] elements) {
        int result = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                result += elements[i];
            }
        }
        return result;
    }


    public static void PrintTheElementsOfThisArrayToTheConsoleUpTtoTheFirstZero(int[] elements) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                break;
            }
            System.out.print(elements[i] + " ");
        }
    }
}
//Дан массив с числами:
//
//int[] arr = {-1, 2, -3, 4, 5, 11};
//Найдите сумму тех элементов этого массива, которые больше нуля и меньше десяти.
//
//№2
//
//Дан массив с целыми числами:
//
//int[] arr = {1, 2, 3, 4, 5};
//Выведите в консоль элементы этого массива, которые являются четными числами.
//
//№3
//
//Дан массив с целыми числами:
//
//int[] arr = {1, 2, 3, 0, 4, 5};
//Выведите в консоль элементы этого массива до первого нуля.