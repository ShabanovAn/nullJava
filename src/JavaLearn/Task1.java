package JavaLearn;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1=sc.next();
            int x=sc.nextInt();
            String s2 = addZero(Integer.toString(x));
            System.out.println(spaces(s1) + s2);
        }
        System.out.println("================================");

    }

    public static String spaces(String notSpaces) {
        int probel = 15 - notSpaces.length();
        notSpaces = notSpaces + " ".repeat(probel);
        return notSpaces;
    }
    //notZero = 003
    public static String addZero(String notZero) {
        while (notZero.length() != 3) {
            notZero = "0" + notZero;
        }
        return notZero;
    }
}

