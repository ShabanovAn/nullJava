package code.mu.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level_2_10_Task_1_2_3_4 {
    public static void main(String[] args) throws IllegalAccessException {
        int[] numbers = {1, 2, 3, 4, 5};
        //Level_2_10_Task_1_2_3_4.outputToTheConsoleAllCommonDivisorsOfTheseNumbers(12, 16);
        //Level_2_10_Task_1_2_3_4.swapTheFirstAndLastElementsOfThisArray(numbers);
        System.out.println(Level_2_10_Task_1_2_3_4.theSumOfTheFirstThreeDigitsEqualsTheSumOfTheSecondThreeDigits(111111));;

    }

    //№1
    public static void getTheVolumeAndSurfaceAreaOfThisBall(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }

    //№2
    public static void outputToTheConsoleAllCommonDivisorsOfTheseNumbers(int number1, int number2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                list.add(i);
            }
        }
        System.out.println(Arrays.asList(list.toArray()));
    }

    //№3
    public static void swapTheFirstAndLastElementsOfThisArray(int[] numbers) {
        int lastElement = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0];
        numbers[0] = lastElement;
        System.out.println(Arrays.toString(numbers));
    }

    //№4
    public static boolean theSumOfTheFirstThreeDigitsEqualsTheSumOfTheSecondThreeDigits(int number) throws IllegalAccessException {
        if (String.valueOf(number).length() != 6) {
            throw new IllegalArgumentException("Число должно иметь 6 знаков");
        }
        char[] chars = String.valueOf(number).toCharArray();
        int firstArrow = chars[0] -'0' + chars[1]-'0' + chars[2]-'0';
        int secondArrow = chars[3]-'0' + chars[4]-'0' + chars[5]-'0';
//        char c = '1';
//        System.out.println(c); // Выведет 1
//        System.out.println((int) c); // Выведет 49
//        System.out.println(c - '0');
        return firstArrow == secondArrow;
    }

}
//№1
//Дана переменная, содержащая радиус шара:
//
//float r = 10.3;
//Получите объем и площадь поверхности этого шара.
//
//№2
//
//Даны два целых числа:
//
//int num1 = 12;
//int num2 = 16;
//Выведите в консоль все общие делители этих чисел.
//
//№3
//
//Дан массив с целыми числами:
//
//int[] {1, 2, 3, 4, 5};
//Поменяйте местами первый и последний элементы этого массива:
//
//int[] {5, 2, 3, 4, 1};
//№4
//
//Дано число из 6-ти цифр
//
//int num = 123321;
//Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр.
