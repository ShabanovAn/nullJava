package JavaLearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> test = new HashMap<String, Integer>();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            test.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (test.containsKey(s)) {
                System.out.println(s + "=" + test.get(s));
            } else {
                System.out.println("Not Found");
            }

        }
    }
}
//    Scanner in = new Scanner(System.in);
//    Map<String, Integer> phoneBookMap = new HashMap<String, Integer>();
//    int n=in.nextInt();
//        in.nextLine();
//                //add elements in phoneBookMap
//                for(int i=0;i<n;i++)
//        {
//        String name=in.nextLine();
//        int phone=in.nextInt();
//        phoneBookMap.put(name, phone);
//        in.nextLine();
//        }
//        //get numbers from phoneBookMap
//        while(in.hasNext())
//        {
//        String s=in.nextLine();
//        if(phoneBookMap.containsKey(s)){
//        System.out.println(s+"="+phoneBookMap.get(s));
//        }
//        else{
//        System.out.println("Not found");
//        }
//        }
//        }
//        }