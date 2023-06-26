import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        String s;
        try {
            s = Integer.toString(number);
            System.out.println("Good job" + s);
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
