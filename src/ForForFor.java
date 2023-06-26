import java.util.Scanner;

public class ForForFor {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int n = in.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(formula(a, b, i) + " ");
//        }
//        in.close();
        System.out.println(formula(5,3, 1));
        System.out.println(pow(2,1));


    }

    private static long formula(int a, int b, int n) {
        long result = a; //8
        for (int i = 0; i < n + 1; i++) { // i=1 n=2
            long b2 = pow(2, i) * b;
            result += b2;
        }
        return result;
    }

    private static long pow(int a, int b) {
        return Math.round(Math.pow(a, b));
    }
}
