package JavaLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numCount = scan.nextInt();
        ArrayList<Integer> listNumb = new ArrayList<>();
        for (int i = 0; i < numCount; i++) {
            int number = scan.nextInt();
            listNumb.add(number);
        }
        int next = scan.nextInt();
        for (int i = 0; i < next; i++) {
            String comand = scan.next();
            if (comand.startsWith("Insert")) {
                int index = scan.nextInt();
                int number = scan.nextInt();
                listNumb.add(index, number);
            } else if(comand.startsWith("Delete")) {
                int deleteIndex = scan.nextInt();
                listNumb.remove(deleteIndex);
            }
        }
        for (Integer integer : listNumb) {
            System.out.print(integer + " ");

        }
    }

}
