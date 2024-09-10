package JavaLearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPhoneBook2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBookMap = new HashMap<String, Integer>();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBookMap.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBookMap.containsKey(s)) {
                System.out.println(s + "=" + phoneBookMap.get(s));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
