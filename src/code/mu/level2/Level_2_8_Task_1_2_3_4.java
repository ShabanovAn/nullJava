package code.mu.level2;

import java.time.Month;
import java.util.Arrays;

public class Level_2_8_Task_1_2_3_4 {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "ef"};
        //Level_2_8_Task_1_2_3_4.massChars(arr);
        //Level_2_8_Task_1_2_3_4.getMonth(11);
        System.out.println(Level_2_8_Task_1_2_3_4.getLastSimvol("12345"));

    }

    public static void massChars(String[] mass) {
        StringBuilder s = new StringBuilder();
        for (String string : mass) {
            s.append(string);
        }
        char[] ch = String.valueOf(s).toCharArray();

        System.out.println(Arrays.toString(ch));
    }

    public static void getMonth(int month){
        System.out.println(Month.of(month).name());
    }

    public static String getLastSimvol(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
             chars = str.toCharArray();
        }
        return String.valueOf(chars[0]) + String.valueOf(chars[chars.length - 1]);
    }
    //4
    public static void getTheAreaAndPerimeterOfThisRectangle(int a, int b) {
        System.out.println("Периметр  прямоугольника = " + 2 * (a+b));
        System.out.println("Площадь прямоугольника = " + a * b);
    }
}
//№1
//
//Дан массив со строками:
//
//String[] arr = {"ab", "cd", "ef"};
//Получите массив символов этих строк:
//
//char[] {'a', 'b', 'c', 'd', 'e', 'f'}
//№2
//
//Дано целое число, содержащее номер месяца от 1 до 12:
//
//byte num = 1;
//Выведите название месяца, соответствующее этому числу.
//
//№3
//
//Дана строка:
//
//String str = "12345";
//Получите первый и последний символ этой строки в следующем виде:
//
//String "15";
//#4
//Даны переменные, содержащие стороны прямоугольника:
//
//        int a = 10;
//        int b = 20;
//        Получите площадь и периметр этого прямоугольника.