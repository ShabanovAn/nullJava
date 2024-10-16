package code.mu.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Level_2_2_Task_1_2_3_4 {
    public static void main(String[] args) {
        //System.out.println(Level_2_2_Task_1_2_3_4.sumFirstNumberPlusSecondNumber(124));
        //System.out.println(Level_2_2_Task_1_2_3_4.arithmeticMeanOfAllStreamEdition());
        int[] mass = {1,2,3,4};
        //System.out.println(Level_2_2_Task_1_2_3_4.sumAllElementsMas(mass));
        System.out.println(Level_2_2_Task_1_2_3_4.sumNumbersInt(12345));

    }

    public static double arithmeticMeanOfAll() {
        int result = 0;

        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
        return (double) result / 100;
    }

    public static double arithmeticMeanOfAllStreamEdition() {
        return IntStream.rangeClosed(1, 100).sum() / 100.0;
    }

    public static int sumFirstNumberPlusSecondNumber(Integer number) {
        int firstElement = Character.getNumericValue(String.valueOf(number).charAt(0));
        int secondNumber = Character.getNumericValue(String.valueOf(number).charAt(String.valueOf(number).length()-1));
        return secondNumber + firstElement;
    }

    public static int sumAllElementsMas(int[] nem) {
        int result = 0;
        for (int i = 0; i < nem.length; i++) {
                result += nem[i];
        }
        System.out.println(result);
        return result;
    }

//    Дано некоторое целое число:
//    int num = 12345;
//    Выведите в консоль все его цифры с конца.

    public static List<Integer> sumNumbersInt(int numb) {
        List<Integer> integerList = new ArrayList<>();
        char[] chars = String.valueOf(numb).toCharArray();
        for (char aChar : chars) {
                integerList.add(Character.getNumericValue(aChar));
        }

        Collections.reverse(integerList);
        return integerList;
    }
}
