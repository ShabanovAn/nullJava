package code.mu.level2;

import java.util.stream.IntStream;

public class Level_2_2_Task_1_2_3_4 {
    public static void main(String[] args) {
        //System.out.println(Level_2_2_Task_1_2_3_4.sumFirstNumberPlusSecondNumber(124));
        System.out.println(Level_2_2_Task_1_2_3_4.arithmeticMeanOfAllStreamEdition());

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



}
