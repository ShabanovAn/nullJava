import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (scanner.hasNext()) {
            number++;
            String s = scanner.nextLine();
            System.out.println(number + " " + s);
            if (s.contains("end-of-file")) {
               break;
            }
        }
        scanner.close();
    }
}
