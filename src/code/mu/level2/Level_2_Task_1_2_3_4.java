package code.mu.level2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level_2_Task_1_2_3_4 {
    public static void main(String[] args) {
        //Level_2_Task_1_2_3_4.printMass(new int[]{2, 3, 4, 5, 6, 7});
        //Level_2_Task_1_2_3_4.print(new String[]{"142", "143", "147"});
        System.out.println(Level_2_Task_1_2_3_4.positivEvenNumber(712345));
        System.out.println(Level_2_Task_1_2_3_4.positivEvenNumberStreamEdition(712345));
        //System.out.println(Level_2_Task_1_2_3_4.factorialNum(5));;
        //System.out.println(Level_2_Task_1_2_3_4.factorialStreamEdition(6));
    }

    public static void printMass(int[] ma) {
        System.out.println(Arrays.toString(ma));
    }

    public static void printMassStreamEdition(int[] ma) {
        Arrays.stream(ma).forEach(System.out::println);
    }


    public static void print(String[] str) {
        for (String s : str) {
            System.out.println(s.charAt(0));

        }
    }

    public static void printStreamEdition(String[] str) {
        Arrays.stream(str)
                .map(s -> String.valueOf(s.charAt(0)))
                .forEach(System.out::println);
    }

    //    Дано некоторое целое число:
//    int num = 12345;
//    Найдите сумму всех его четных цифр.
    public static int positivEvenNumber(int number) {
        int result = 0;
        String s = String.valueOf(Math.abs(number));
        for (char charToInt : s.toCharArray()) {
            int n = Character.getNumericValue(charToInt);
            if (n % 2 == 0) {
                result += n;
            }
        }
        return result;
    }

    public static int positivEvenNumberStreamEdition(int number) {
        int result = 0;
        return String.valueOf(Math.abs(number))
                .chars()
                .map(Character::getNumericValue)
                .filter(n -> n % 2 == 0)
                .sum();

    }

    public static int factorialNum(int num) {
        int result = 1;
        if (num == 1 || num == 0) {
            System.out.println(1);
        }
        for (int i = 1; i <= num; i++) {
               result *= i;
        }
        return result;
    }

    public static int factorial(int n) {
        int res = 1, i = 2;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }
                                            //4 , 4  // n = 4
    public static int factorialStreamEdition(int n) {
       return IntStream.rangeClosed(1, n)
               .reduce(1, (accamulator,element) -> accamulator * element); //24
    }
}

