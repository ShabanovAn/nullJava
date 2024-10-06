package code.mu.level1;

import java.util.Objects;
import java.util.stream.LongStream;

public class Level_1_Task_1_2_3_4_5_6 {
    public static void main(String[] args) {
        Level_1_Task_1_2_3_4_5_6.NegativeNumber(-1);
        Level_1_Task_1_2_3_4_5_6.NegativeNumber(-1);
        //System.out.println(Level_1_Task_1_2_3_4_5_6.lengthString("test"));
        //System.out.println(Level_1_Task_1_2_3_4_5_6.getLastSimvolString("test"));
        //System.out.println(Level_1_Task_1_2_3_4_5_6.getEvenNumber(3L));
        //System.out.println(Level_1_Task_1_2_3_4_5_6.theTwoWordsMathes("test", "test"));
        //System.out.println(Level_1_Task_1_2_3_4_5_6.aSoftSignTheWords("test"));

    }

    public static void NegativeNumber(Integer integer) {
        if (integer >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static String NegativeNumberStream(Integer integer) {
        return integer >= 0 ? "Число положительное" : "Число отрицательное";
    }

    public static int lengthString(String string) {
        return string.length();
    }

    public static int lengthStringStream(String string) {
        return Integer.parseInt(String.valueOf(string.length()));
    }

    public static Character getLastSimvolString(String s) {
        return s.charAt(s.length() - 1);
    }

    public static Character getLastSimvolStringStream(String s) {
        return s.length() == 0 ? null : s.charAt(s.length() - 1);
    }

    public static boolean getEvenNumber(Long number) {

        return number % 2 == 0;
    }

    public static boolean getEvenNumberStream(Long number) {
        return LongStream.of(number).anyMatch(n -> n % 2 == 0);
    }

    public static boolean theTwoWordsMathes(String first, String second) {
        return Objects.equals(first.charAt(0), second.charAt(0));
    }

    public static Character aSoftSignTheWords(String s) {
        if (Objects.equals(s.charAt(s.length() - 1), 'ь')) {
            return s.charAt(s.length() - 2);
        } else {
            return s.charAt(s.length() - 1);
        }
    }

    public static Character aSoftSignTheWordsStream(String s) {
        return s.charAt(s.length() - 1) == 'ь'
                ? s.charAt(s.length() - 2)
                : s.charAt(s.length() - 1);
        }

    }
