package code.mu.level2;

import java.util.Arrays;
import java.util.Stack;

public class Level_2_3_Task_1_2_3 {
    public static void main(String[] args) {
        int[] massNumbers = {2,2,2};
        //System.out.println(Level_2_3_Task_1_2_3.sumSquare(massNumbers));
        Level_2_3_Task_1_2_3.addElemets();
    }


    //№1
    public static int sumSquare(int[] mass) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            result += (int) Math.pow(mass[i], 2);
        }
        return result;
    }

    //№2
    public static double averageArefmitic(int[] mass) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            result += mass[i];
        }
        return (double) result / mass.length;
    }

    public static void addElemets() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

}


//№1
//
//Дан массив с целыми числами:
//
//int[] arr = {1, 2, 3, 4, 5};
//Найдите сумму квадратов элементов этого массива.
//
//№2
//
//Дан массив с целыми числами:
//
//int[] arr = {1, 2, 3, 4, 5};
//Найдите среднее арифметическое этого массива.
//
//№3
//
//Дан массив:
//
//int[10] arr;
//С помощью цикла заполните этот массив целыми числами от 1 до 10.