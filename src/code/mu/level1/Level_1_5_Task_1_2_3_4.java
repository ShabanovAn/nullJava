package code.mu.level1;

public class Level_1_5_Task_1_2_3_4 {
    public static void main(String[] args) {
        //Level_1_5_Task_1_2_3_4.allNumbersAreMultiplesOfThreeInTheRangeFrom1To100();
        //ystem.out.println(Level_1_5_Task_1_2_3_4.checkThatTheFirstNumberIsCompletelyDivisibleByTheSecond(9, 3));
        System.out.println(Level_1_5_Task_1_2_3_4.MergeCharactersIntoAString());
    }

    public static void allNumbersAreMultiplesOfThreeInTheRangeFrom1To100() {
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
        for (int i = 3; i < 100; i += 3) {
            System.out.println(i);
        }
    }


    public static boolean checkThatTheFirstNumberIsCompletelyDivisibleByTheSecond(Integer first, Integer second) {
        return first % second == 0;
    }

    public static String  MergeCharactersIntoAString() {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        return String.valueOf(a) + c + b;
    }

    public static byte getByte(int kb) {
        return (byte) (kb * 1024);
    }

}
