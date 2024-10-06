import java.util.Scanner;

public class PolindromEighthTask {

    public static void main(String[] args) {


        String inputString, reversedString = "";

        Scanner scannerQ = new Scanner(System.in);

        int stringLength;

        System.out.println("Введите число или строку");

        inputString = scannerQ.nextLine();

        stringLength = inputString.length();

        for (int x = stringLength - 1; x >= 0; x--) {

            reversedString = reversedString + inputString.charAt(x);

        }

        System.out.println("перевернутое значение: " + reversedString);


        if (inputString.equals(reversedString)) {
            System.out.println("Введенное значение является палиндромом");
        } else {
            System.out.println("Введенное значение не является палиндромом");
        }


    }
    public static boolean isPalindromeInteger(int number) {
        String str = String.valueOf(number);
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
