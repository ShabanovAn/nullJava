package code.mu.level2;

import java.util.Arrays;

public class Level_2_5_Task_1_2_3 {
    public static void main(String[] args) {
        int[] numers = {1,2,5,4,6};
        String[] arrays =  {"123", "456", "789"};
        //System.out.println(Level_2_5_Task_1_2_3.findTtheSumOfThePositiveElements(numers));
        //Level_2_5_Task_1_2_3.outputTheElementsOfThisArrayToTheConsole(numers);
        System.out.println(Arrays.toString(Level_2_5_Task_1_2_3.transformThisArray(arrays)));
    }
    //№1
    public static int findTtheSumOfThePositiveElements(int[] number) {
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] > 0) {
                result += number[i];
            }
        }
        return result;
    }

    //№2
    public static void outputTheElementsOfThisArrayToTheConsole(int[] mass) {
        for (int i = mass.length-1; i >= 0 ; i--) {
             System.out.println(mass[i]);
        }
    }

    //№3
    public static int[] transformThisArray(String[] mass) {
        int[] newNumbersArray= new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            newNumbersArray[i] = Integer.parseInt(mass[i]);
        }

        return newNumbersArray;
    }

}

//№1
//
//Дан массив с числами:
//
//int[] arr = [1, 2, -3, 4, -5];
//Найдите сумму положительных элементов этого массива.
//
//№2
//
//Дан массив с числами:
//
//int[] arr = {1, 2, 3, 4, 5};
//Выведите в консоль элементы этого массива в обратном порядке.
//
//№3
//
//Дан массив со строками, содержащими целые числа:
//
//String[] {"123", "456", "789"};
//Преобразуйте этот массив так, чтобы значениями нового массива стали целые числа:
//
//int[] {123, 456, 789};
