package code.mu.level2;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Level_2_7_Task_1_2_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String[] arr2 = {"2025", "12", "31"};
        //System.out.println(Level_2_7_Task_1_2_3.SumKvadrat(arr));
        //System.out.println(Level_2_7_Task_1_2_3.mergeTheElementsOfThisArrayIntoAString(arr));
        System.out.println(Level_2_7_Task_1_2_3.fromTheElementsOfThisArrayAssembleTheDateInTheFollowingFormat(arr2));

    }
    //№1
    public static int SumKvadrat(int[] mass) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            result+= mass[i] * mass[i];
        }
        return result;
    }
    //№2
    public static String mergeTheElementsOfThisArrayIntoAString(int[] mass) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mass.length; i++) {
            sb.append(mass[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    //№3
    public static String fromTheElementsOfThisArrayAssembleTheDateInTheFollowingFormat(String[] arr) {
        String s = String.format("%s-%s-%s", arr[2], arr[1], arr[0]);
        return s;
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
//Дан массив с числами:
//
//int[] arr = {1, 2, 3, 4, 5};
//Слейте элементы этого массива в строку:
//
//"12345"
//№3
//
//Дан массив с датой:
//
//String[] arr = {"2025", "12", "31"};
//Из элементов этого массива соберите дату в следующем формате:
//
//"31-12-2025"