package code.mu.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Level_1_10_Task_1_2_3_4 {
    public static void main(String[] args) {
        Level_1_10_Task_1_2_3_4.sumNumbers1to100();
        System.out.println();
        Level_1_10_Task_1_2_3_4.sumNumbers1to100();
        //System.out.println( Level_1_10_Task_1_2_3_4.getSecondInYears(1));
       // Level_1_10_Task_1_2_3_4.printAllTheDivisorsOfЕhisТumberЕoЕheСonsole(12);
        //System.out.println(Level_1_10_Task_1_2_3_4.divideNumber2(12345));
       int[] mass = new int[] {1, 2,3,4};
       Level_1_10_Task_1_2_3_4.sumElementsMass(mass);
    }


    public static void sumNumbers1to100() {
        int sum = 0;
        for (int i = 2; i < 100; i += 2) {
            System.out.println(sum += i);
        }
    }

    public static void sumNumbers1to100Stream() {
        int sum = IntStream.rangeClosed(2, 100)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);
    }

    public static int getSecondInYears(int yesr) {
        return yesr * (365 * 86400);
    }

    public static void printAllTheDivisorsOfЕhisТumberЕoЕheСonsole(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            if ((a % i) == 0) {
                list.add(i);
            }
        }
        System.out.println(List.of(list));
    }

    public static void printAllTheDivisorsOfЕhisТumberЕoЕheСonsoleStreamEdition(int a) {
        IntStream.rangeClosed(1, a)
                .filter(i -> a % i == 0).
                forEach(System.out::println);
    }

    public static void printAllTheDivisorsOfЕhisТumberЕoЕheСonsoleStreamEditionTWO(int a) {
        System.out.println(IntStream.rangeClosed(1,a)
                .filter(i -> a % i == 0)
                .boxed()
                .collect(Collectors.toList()));
    }


    //
//    Дано некоторое число:
//
//    float num = 12345;
//    Делите его на два столько раз, пока результат не будет меньше 10. Сколько итераций для этого потребуется?
    public static int divideNumber2(int num) {
        int count = 0;
        while (num >= 10) {
            num /= 2;
            count++;
        }
        return count;
    }

    public static int divideNumber2Stream(int num) {
        return (int) Stream.iterate(num, n -> n >= 10, n -> n / 2).count();
    }

   public static void sumElementsMass(int[] mas) {
        int result = 0;
       for (int i = 0; i < mas.length; i++) {
           result += mas[i];
       }
       System.out.println(result);

   }

}
