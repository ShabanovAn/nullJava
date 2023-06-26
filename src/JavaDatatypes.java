import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        for (Long number : JavaDatatypes.getNumber(2)) {
            if (number < Long.MAX_VALUE && number > Long.MIN_VALUE) {
                System.out.println("Long");
            }
            if (number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
                System.out.println("Int");
            }
            if (number < Short.MAX_VALUE && number > Short.MIN_VALUE) {
                System.out.println("Short");
            }
        }
    }
     public static List<Long> getNumber(int countNumber) {
         List<Long> numbers = new ArrayList<>();
         Scanner scan = new Scanner(System.in);
         for (int i = 0; i < countNumber; i++) {
             Long numCount = scan.nextLong(); // число на про
             numbers.add(numCount);
         }
         return numbers;
     }
}
