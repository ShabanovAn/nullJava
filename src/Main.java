import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main  {
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





