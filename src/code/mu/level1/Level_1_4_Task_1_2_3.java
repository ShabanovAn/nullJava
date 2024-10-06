package code.mu.level1;

public class Level_1_4_Task_1_2_3 {
    public static void main(String[] args) {
        //Level_1_4_Task_1_2_3.allEvenNumbersFromTheRangeFrom1To100();
        //Level_1_4_Task_1_2_3.outputToTheConsoleOneByOneAllTheCharactersFromTheEndOfTheLine("abcde");
        Level_1_4_Task_1_2_3.determineWhichQuarterOfAnHourThisValueFallsInto(59);
    }

    public static void allEvenNumbersFromTheRangeFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void outputToTheConsoleOneByOneAllTheCharactersFromTheEndOfTheLine(String str) {
        char[] charArray  = str.toCharArray();
        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }


    public static void determineWhichQuarterOfAnHourThisValueFallsInto(Integer num) {
        if(num > 60) {
            throw new IllegalArgumentException("Нельзя вводить больше 60");
        }
        if (num >= 0 && num < 15) {
            System.out.println("First quarter");
        } else if (num >= 15 && num < 30) {
            System.out.println("Second quarter");
        } else if (num >= 30 && num < 45) {
            System.out.println("Third quarter");
        } else if (num >= 45) {
            System.out.println("Fourth quarter");
        }
    }
}
