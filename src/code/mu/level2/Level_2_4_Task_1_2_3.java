package code.mu.level2;

import java.util.Arrays;

public class Level_2_4_Task_1_2_3 {
    public static void main(String[] args) {
        int[] mas = {4, 4};
        System.out.println(Level_2_4_Task_1_2_3.findTheSumOfTheSquare(mas));
        // System.out.println(Arrays.toString(Level_2_4_Task_1_2_3.increaseEachElementOfThisArray(mas)));
        //Level_2_4_Task_1_2_3.useALoopToFillThisArrayWithIntegers();


    }

    //№1
    public static int findTheSumOfTheSquare(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += (int) Math.sqrt(numbers[i]);
        }
        return result;
    }

    //№2
    public static int[] increaseEachElementOfThisArray(int[] numb) {
        for (int i = 0; i < numb.length; i++) {
            numb[i] = numb[i] * 2;
        }

        return numb;
    }

    public static void useALoopToFillThisArrayWithIntegers() {
        int[] numb = new int[10];
        int count = 0;
        for (int i = numb.length - 1; i >= 0; i--) {
            numb[count++] = i+1;
        }
        System.out.println(Arrays.toString(numb));
    }

}
//№1
//
//Дан массив с числами:
//
//int[] arr = [1, 2, 3, 4, 5];
//Найдите сумму квадратных корней элементов этого массива.
//
//№2
//
//Дан массив с числами:
//
//int[] {1, 2, 3, 4};
//Увеличьте каждый элемент этого массива в два раза:
//
//int[] {2, 4, 9, 8};
//№3
//
//Дан массив:
//
//int[10] arr;
//С помощью цикла заполните этот массив целыми числами от 10 до 1.