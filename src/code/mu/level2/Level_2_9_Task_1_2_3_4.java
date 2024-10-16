package code.mu.level2;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Level_2_9_Task_1_2_3_4 {
    public static void main(String[] args) {
        int[] numb = {1, 2, 3, 4, 5};
        //Level_2_9_Task_1_2_3_4.UsingALoopFillTheArrayWithEvenNumbers();
        //Level_2_9_Task_1_2_3_4.swapTheFirstAndSecondElements(numb);
        //Level_2_9_Task_1_2_3_4.determineIfThisVariableContainsADayOffOrAWeekday(7);
        System.out.println(Level_2_9_Task_1_2_3_4.celsiustoFahrenheit(27));

    }

    //№1
    public static void UsingALoopFillTheArrayWithEvenNumbers() {
        int[] massNumbers = new int[50];
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                massNumbers[count] = i;
                count++;
            }
        }

        System.out.println(Arrays.toString(massNumbers));
    }
    //№2
    public static void swapTheFirstAndSecondElements(int[] nummers) {
        int firstElement = nummers[1];
        nummers[1] = nummers[0];
        nummers[0] = firstElement;
        System.out.println(Arrays.toString(nummers));
    }
    //№3
    public static void determineIfThisVariableContainsADayOffOrAWeekday(int number) {
        if (number > 0 && number <= 5) {
        System.out.println(DayOfWeek.of(number) + " Будний день");
        } else {
            System.out.println(DayOfWeek.of(number) + " Выходной день");
        }
    }
    //№4
    public static double celsiustoFahrenheit(int celsius) {
        return celsius * 1.8 + 32;
    }

}
//№
//С помощью цикла заполните массив четными числами из промежутка от 1 до 100.
//
//№2
//
//Дан массив с целыми числами:
//
//int[] {1, 2, 3, 4, 5};
//Поменяйте местами первый и второй элементы этого массива:
//
//int[] {2, 1, 3, 4, 5};
//№3
//
//Дано целое число, содержащее номер дня недели от 1 до 7:
//
//byte num = 1;
//Определите, эта переменная содержит выходной или будний день.
//
//№4
//
//Дана переменная, содержащая температуру в градусах Цельсия:
//
//short tc = 25;
//Напишите программу, которая преобразует эту температуру в градусы Фарингейта.