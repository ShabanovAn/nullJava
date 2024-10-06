package code.mu.level1;

import java.util.Objects;

public class Level_1_2_Task_1_2_3_4_5 {
    public static void main(String[] args) {
        System.out.println(Level_1_2_Task_1_2_3_4_5.matchingNumbers(113, 2114));

    }

    public static Integer firstNumber(Integer first) {
        return Character.getNumericValue(String.valueOf(first).charAt(0));
    }

    public static Integer lastNumber(Integer first) {
        return Character.getNumericValue(String.valueOf(first).charAt(String.valueOf(first).length()-1));
    }

    public static Integer sumFirstNumberAndLastNumber(Integer first) {
        Integer firstNumber = Character.getNumericValue(String.valueOf(first).charAt(String.valueOf(first).length()-1));
        Integer secondNumber = Character.getNumericValue(String.valueOf(first).charAt(0));
        return firstNumber + secondNumber;

    }

    public static Integer countNumbersAll(Integer first) {
        return
                String.valueOf(first).length();
    }

    public static boolean matchingNumbers(Integer first, Integer second) {
        return Objects.equals(String.valueOf(first).charAt(0), String.valueOf(second).charAt(0));
    }
}
