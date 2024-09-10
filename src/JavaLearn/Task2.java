package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf(s1 + "               " + x);

        }
        System.out.println("================================");
    }
}
//System.out.println((N%2==1)||(N>5 && N< 21)?"Weird":"Not Weird");