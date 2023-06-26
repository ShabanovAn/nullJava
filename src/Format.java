import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
        String test = scan.nextLine(); //java 100
        String[] firstText = test.split(" ");
        System.out.println(spaces(firstText[0]) + addZero(firstText[1]));
        }
    }

    public static String spaces(String notSpaces) {
        int probel = 15 - notSpaces.length();
        notSpaces = notSpaces + " ".repeat(probel);
        return notSpaces;
    }

    public static String addZero(String notZero) {
        while (notZero.length() != 3) {
            notZero = "0" + notZero;
        }
        return notZero;
    }
}
