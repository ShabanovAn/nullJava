import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCount = scan.nextInt();
        List<Integer> listNumb = new ArrayList<>();
        for (int i = 0; i < numCount; i++) {
            int number = scan.nextInt();
            listNumb.add(number);
        }
        listNumb.forEach(System.out::println);
    }
}
